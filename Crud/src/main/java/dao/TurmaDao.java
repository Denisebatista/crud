package dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import entidades.Turma;
import services.PesistenciaDacException;
import util.TransacionalCdi;

public class TurmaDao {
	
	@Inject
	private EntityManager manager;


	public Turma getByID(int idTurma) throws PesistenciaDacException {
		return manager.find(Turma.class, idTurma);
	}

	@TransacionalCdi
	public void save(Turma turma) throws PesistenciaDacException {
		manager.persist(turma);
	}

	@TransacionalCdi
	public void update(Turma turma) throws PesistenciaDacException {
		manager.merge(turma);	
	}

	@TransacionalCdi
	public void delete(Turma tur) throws PesistenciaDacException {
		Turma turma = manager.find(Turma.class, tur.getId_turma());
	}

	public List<Turma> getAll() throws PesistenciaDacException {
		Query query = manager.createQuery("from Turma");
		return query.getResultList();
	}
}
