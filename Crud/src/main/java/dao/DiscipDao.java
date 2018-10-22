package dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import entidades.Disciplina;
import services.PesistenciaDacException;
import util.TransacionalCdi;

public class DiscipDao {
	
	@Inject
	private EntityManager manager;
	
	@TransacionalCdi
	public Disciplina getByID(Integer id_disciplina) throws PesistenciaDacException {
		return manager.find(Disciplina.class, id_disciplina); 
	}
	
	@TransacionalCdi
	public void save(Disciplina disciplina) throws PesistenciaDacException {
		manager.persist(disciplina);
		
	}
	
	@TransacionalCdi
	public void update(Disciplina disciplina) throws PesistenciaDacException {
		manager.merge(disciplina); 
		
	}

	@TransacionalCdi
	public void delete(Disciplina disc) throws PesistenciaDacException {
		Disciplina disciplina = manager.find(Disciplina.class, disc.getIdDisciplina());
		
	}
	public List<Disciplina> getAll() throws PesistenciaDacException {
		Query query = manager.createQuery("from Disciplina");
		return query.getResultList();
	}
}
