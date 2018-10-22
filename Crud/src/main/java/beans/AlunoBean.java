package beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import dao.AlunoDao;
import entidades.Aluno;
import entidades.Disciplina;
import entidades.Professor;
import entidades.Turma;
import services.PesistenciaDacException;

@ViewScoped
@Named
public class AlunoBean implements Serializable {
	
	@Inject
	private AlunoDao dao;

	private Aluno aluno;
	private String alunoBuscar;
	
	protected entidades.Disciplina entidade1;
	protected Collection<Disciplina> entidades1;
	
	protected Professor entidade2;
	protected Collection<Professor> entidades2;
	
	protected Turma entidade3;
	protected Collection<Turma> entidades3;
	
	@PostConstruct
	public void init() {
	}
	
	public AlunoDao getDao() {
		return dao;
	}
	public void setDao(AlunoDao dao) {
		this.dao = dao;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public String getAlunoBuscar() {
		return alunoBuscar;
	}
	public void setAlunoBuscar(String alunoBuscar) {
		this.alunoBuscar = alunoBuscar;
	}
	public entidades.Disciplina getEntidade1() {
		return entidade1;
	}
	public void setEntidade1(entidades.Disciplina entidade1) {
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
	public void adicionarAluno() throws PesistenciaDacException {
		Aluno aluno2 = dao.getByID(aluno.getId_aluno());
		
		if (aluno2 == null) {
			dao.save(aluno);
			
		} else {
			aluno2.setId(aluno.getId());
			aluno2.setNome(aluno.getNome());
			aluno2.setId(aluno.getId_aluno());
			dao.update(aluno2);
		}
		aluno = new Aluno();
	}

	public void removerAluno(Aluno id_aluno) throws PesistenciaDacException {
		dao.delete(id_aluno);
	}

	public AlunoBean() {
		aluno = new Aluno();
	}
	
	
}
	