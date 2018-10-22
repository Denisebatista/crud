package beans;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import dao.DiscipDao;
import entidades.Disciplina;
import services.PesistenciaDacException;

@ViewScoped
@Named
public class DisciplinaBean implements Serializable {
	
	@Inject
	private DiscipDao dao;

	private Disciplina disciplina;
	private String disciplinaBuscar;
	
	@PostConstruct
	public void init() {
	}
	public DiscipDao getDao() {
		return dao;
	}
	public void setDao(DiscipDao dao) {
		this.dao = dao;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public String getDisciplinaBuscar() {
		return disciplinaBuscar;
	}
	public void setDisciplinaBuscar(String disciplinaBuscar) {
		this.disciplinaBuscar = disciplinaBuscar;
	}
	
	public void adicionarDisciplina() throws PesistenciaDacException {
		Disciplina disciplina2 = dao.getByID(disciplina.getIdDisciplina());
		
		if (disciplina2 == null) {
			dao.save(disciplina);
			
		} else {
			disciplina2.setProfessor(disciplina.getProfessor());
			disciplina2.setNome(disciplina.getNome());
			disciplina2.setIdDisciplina(disciplina.getIdDisciplina());
			dao.update(disciplina2);
		}
		disciplina = new Disciplina();
	}

	public void removerDisciplina(Disciplina id_disciplina) throws PesistenciaDacException {
		dao.delete(id_disciplina);
	}

	public DisciplinaBean() {
		disciplina = new Disciplina();
	}
	

}
