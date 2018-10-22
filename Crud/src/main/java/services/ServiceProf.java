package services;

import java.io.Serializable;
import java.util.List;

import dao.ProfDao;
import entidades.Professor;

public class ServiceProf implements Serializable {

private static final long serialVersionUID = -7803325791425670859L;
	
	private ProfDao Dao = new ProfDao();
	
	public void save(Professor prof) throws ServiceDacException {
		try {
			Dao.save(prof);
		} catch (PesistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

	public void update(Professor prof) throws ServiceDacException {
		
		try {
			Dao.update(prof);
		} catch (PesistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

	public void delete(Professor prof) throws ServiceDacException {
		try {
			Dao.delete(prof);
		} catch (PesistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

	public Professor getByID(int profId) throws ServiceDacException {
		try {
			return Dao.getByID(profId);
		} catch (PesistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

	public List <Professor> getAll() throws ServiceDacException {
		try {
			return Dao.getAll();
		} catch (PesistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

}
