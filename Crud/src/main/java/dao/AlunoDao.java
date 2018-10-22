package dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import entidades.Aluno;
import services.PesistenciaDacException;
import util.TransacionalCdi;

public class AlunoDao {
	
	@Inject
	private EntityManager manager;

	@TransacionalCdi
	public void save(Aluno aluno) throws PesistenciaDacException {
		manager.persist(aluno);
	}
	
	@TransacionalCdi
	public void update(Aluno aluno) throws PesistenciaDacException {
		manager.merge(aluno);
		
	}
	
	@TransacionalCdi
	public void delete(Aluno alu) throws PesistenciaDacException {
		Aluno aluno = manager.find(Aluno.class, alu.getId_aluno());
	}
	
	public Aluno getByID(int idAluno) throws PesistenciaDacException {
		return manager.find(Aluno.class, idAluno);
	}
	
	public List<Aluno> getAll() throws PesistenciaDacException {
		Query query = manager.createQuery("from Aluno");
		return query.getResultList();
	}
	

}
