package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "professor")
public class Professor {
	
	@Id
	@Column(name = "id_prof")
	private Integer id_professor;
	private String cpf;
	private int telefone;
	private String nome;
	private Integer disciplina;
	private String professor;
	private String turma;
	private String aluno;


	public Integer getIdProfessor() {
		return id_professor;
	}

	public void setIdProfessor(Integer id_professor) {
		this.id_professor = id_professor;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Integer disciplina) {
		this.disciplina = disciplina;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}
	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	@Override
	public String toString() {
		return "Professor [idProfessor=" + id_professor + ", cpf=" + cpf + ", telefone=" + telefone + ", nome=" + nome
				+ ", disciplina=" + disciplina + ", professor=" + professor + ", turma=" + turma + ", aluno=" + aluno
				+ "]";
	}

	
}
