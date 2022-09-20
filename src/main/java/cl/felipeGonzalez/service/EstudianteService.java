package cl.felipeGonzalez.service;

import java.util.List;

import cl.felipeGonzalez.model.Estudiante;

public interface EstudianteService {
	public List<Estudiante> listAllEstudiantes();

	public Estudiante guardarEstudiante(Estudiante estudiante);

	public Estudiante getEstudianteById(Long id);

	public Estudiante updateEstudiante(Estudiante estudiante);

	public void deleteEstudiante(Long id);
}
