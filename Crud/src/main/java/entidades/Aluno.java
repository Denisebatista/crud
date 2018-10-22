package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import entidades.Professor;


@Entity
public class Aluno implements Identificavel {
	
	@Id
	@Column(name = "id_aluno")
	private Integer id_aluno;
	

	private int idade;
	private String nome;
	private Integer disciplina;
	private Professor professor;
	private String turma;
	private String cpf;
	private int telefone;

	public Integer getId_aluno() {
		return id_aluno;
	}

	public void setId(Integer id_aluno) {
		this.id_aluno = id_aluno;
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public String getTurma() {
	return turma;
}

public void setTurma(String turma) {
	this.turma = turma;
}
@Override
	public String toString() {
		return "Aluno [id=" + id_aluno + ", cpf=" + cpf + ", telefone=" + telefone + ", turma=" + turma + "]";
	}

public Long getId() {
	// TODO Auto-generated method stub
	return null;
}

public void setId(Long id) {
	// TODO Auto-generated method stub
	
}



}
