package services;

import java.io.Serializable;
import java.util.List;

import dao.TurmaDao;
import entidades.Turma;

public class ServiceTur implements Serializable {
	
private static final long serialVersionUID = -7803325791425670859L;
	
	private TurmaDao Dao = new TurmaDao();
	
	public void save(Turma tur) throws ServiceDacException {
		try {
			Dao.save(tur);
		} catch (PesistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

	public void update(Turma tur) throws ServiceDacException {
		
		try {
			Dao.update(tur);
		} catch (PesistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

	public void delete(Turma tur) throws ServiceDacException {
	
		try {
			Dao.delete(tur);
		} catch (PesistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

	public Turma getByID(int turId) throws ServiceDacException {
		try {
			return Dao.getByID(turId);
		} catch (PesistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

	public List <Turma> getAll() throws ServiceDacException {
		try {
			return Dao.getAll();
		} catch (PesistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

}
