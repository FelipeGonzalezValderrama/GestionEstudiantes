package cl.felipeGonzalez.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.felipeGonzalez.model.Estudiante;
import cl.felipeGonzalez.repository.EstudianteRepository;

@Service
public class EstudianteServiceImpl implements EstudianteService {

	@Autowired
	private EstudianteRepository repository;

	@Override
	public List<Estudiante> listAllEstudiantes() {
		return repository.findAll();
	}

	@Override
	public Estudiante guardarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		return repository.save(estudiante);
	}

	@Override
	public Estudiante getEstudianteById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public Estudiante updateEstudiante(Estudiante estudiante) {
		return repository.save(estudiante);
	}

	@Override
	public void deleteEstudiante(Long id) {
		repository.deleteById(id);

	}

}
