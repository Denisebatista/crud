package dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import entidades.Professor;
import services.PesistenciaDacException;
import util.TransacionalCdi;

public class ProfDao {

	@Inject
	private EntityManager manager;
	
	public Professor getByID(int idProfessor) throws PesistenciaDacException {
		return manager.find(Professor.class, idProfessor);
	}

	@TransacionalCdi
	public void save(Professor professor) throws PesistenciaDacException {
		manager.persist(professor);
		
	}

	@TransacionalCdi
	public void update(Professor professor) throws PesistenciaDacException {
		manager.merge(professor);		
	}

	@TransacionalCdi
	public void delete(Professor prof) throws PesistenciaDacException {
		Professor professor = manager.find(Professor.class, prof.getIdProfessor());
		
	}public List<Professor> getAll() throws PesistenciaDacException {
		Query query = manager.createQuery("from Professor");
		return query.getResultList();
	}

}
