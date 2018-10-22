package beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import dao.ProfDao;
import entidades.Disciplina;
import entidades.Professor;
import entidades.Turma;
import services.PesistenciaDacException;

@ViewScoped
@Named
public class ProfessorBean implements Serializable {

	@Inject
	private ProfDao dao;
    
	private Professor professor;
	private String professorBuscar;
	
	protected Disciplina entidade1;
	protected Collection<Disciplina> entidades1;
	
	protected Professor entidade2;
	protected Collection<Professor> entidades2;
	
	protected Turma entidade3;
	protected Collection<Turma> entidades3;
	
	@PostConstruct
	public void init() {
	}
	public ProfDao getDao() {
		return dao;
	}
	public void setDao(ProfDao dao) {
		this.dao = dao;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public String getProfessorBuscar() {
		return professorBuscar;
	}
	public void setProfessorBuscar(String professorBuscar) {
		this.professorBuscar = professorBuscar;
	}
	public Disciplina getEntidade1() {
		return entidade1;
	}
	public void setEntidade1(Disciplina entidade1) {
		this.entidade1 = entidade1;
	}
	public Collection<Disciplina> getEntidades1() {
		return entidades1;
	}
	public void setEntidades1(Collection<Disciplina> entidades1) {
		this.entidades1 = entidades1;
	}
	public Professor getEntidade2() {
		return entidade2;
	}
	public void setEntidade2(Professor entidade2) {
		this.entidade2 = entidade2;
	}
	public Collection<Professor> getEntidades2() {
		return entidades2;
	}
	public void setEntidades2(Collection<Professor> entidades2) {
		this.entidades2 = entidades2;
	}
	public Turma getEntidade3() {
		return entidade3;
	}
	public void setEntidade3(Turma entidade3) {
		this.entidade3 = entidade3;
	}
	public Collection<Turma> getEntidades3() {
		return entidades3;
	}
	public void setEntidades3(Collection<Turma> entidades3) {
		this.entidades3 = entidades3;
	}	
	public void adicionarProfessor() throws PesistenciaDacException{
	   	 Professor professor2 = dao.getByID(professor.getIdProfessor());
	   	 
	    	if (professor2 == null) {
	   		 dao.save(professor);    
	       	 
	    	}else {
	   		 professor2.setNome(professor.getNome());
	   		 professor2.setIdProfessor(professor.getIdProfessor());
	   		 dao.update(professor2);
	    	}
	    	professor = new Professor();
		}
	    
		public void removerProfessor(Professor idProfessor) throws PesistenciaDacException{
			dao.delete(idProfessor);
		}
	    
		public ProfessorBean() {
	   	 	professor = new Professor();
		}
}
