package beans;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import dao.TurmaDao;
import entidades.Turma;
import services.PesistenciaDacException;

@ViewScoped
@Named
public class TurmaBean implements Serializable  {

	@Inject
	private TurmaDao dao;

	private Turma turma;
	private String turmaBuscar;
	public TurmaDao getDao() {
		return dao;
	}
	public void setDao(TurmaDao dao) {
		this.dao = dao;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	public String getTurmaBuscar() {
		return turmaBuscar;
	}
	public void setTurmaBuscar(String turmaBuscar) {
		this.turmaBuscar = turmaBuscar;
	}
	public void adicionarTurma() throws PesistenciaDacException {
		Turma turma2 = dao.getByID(turma.getId_turma());
		
		if (turma2 == null) {
			dao.save(turma);
			
		} else {
			turma2.setProfessor(turma.getProfessor());
			turma2.setDisciplina(turma.getDisciplina());
			turma2.setId_turma(turma.getId_turma());
			dao.update(turma2);
		}
		turma = new Turma();
	}

	public void removerTurma(Turma idTurma) throws PesistenciaDacException {
		dao.delete(idTurma);
	}

	public TurmaBean() {
		turma = new Turma();
	}

}
