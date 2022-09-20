package cl.felipeGonzalez.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import cl.felipeGonzalez.model.Estudiante;
import cl.felipeGonzalez.service.EstudianteService;

@Controller
public class EstudianteController {
	@Autowired
	private EstudianteService service;

	@GetMapping({ "/estudiante", "/" })
	public String listarEstudiantes(Model model) {
		model.addAttribute("estudiante", service.listAllEstudiantes());
		return "estudiante";

	}

	@GetMapping("/estudiante/nuevo")
	public String mostrarFormularioRegistro(Model model) {
		Estudiante estudiante = new Estudiante();
		model.addAttribute("estudiante", estudiante);
		return "crear_estudiante";

	}

	@PostMapping("/estudiante")
	public String guardarEstudiante(@ModelAttribute("estudiante") Estudiante estudiante) {
		service.guardarEstudiante(estudiante);
		return "redirect:/estudiante";

	}

	@GetMapping("/estudiante/editar/{id}")
	public String mostrarFormularioEdit(@PathVariable Long id, Model model) {
		model.addAttribute("estudiante", service.getEstudianteById(id));
		return "editar_estudiante";
	}

	@PostMapping("/estudiante/{id}")
	public String updateEstudiante(@PathVariable Long id, @ModelAttribute("estudiante") Estudiante estudiante,
			Model model) {
		Estudiante estudianteExistente = service.getEstudianteById(id);
		estudianteExistente.setId(id);
		estudianteExistente.setNombre(estudiante.getNombre());
		estudianteExistente.setApellido(estudiante.getApellido());
		estudianteExistente.setEmail(estudiante.getEmail());
		service.updateEstudiante(estudianteExistente);
		return "redirect:/estudiante";

	}

	@GetMapping("/estudiante/{id}")
	public String eliminarEstudiante(@PathVariable Long id) {
		service.deleteEstudiante(id);
		return "redirect:/estudiante";

	}

}
