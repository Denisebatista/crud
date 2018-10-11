package entidades;

import javax.persistence.Id;

public class Disciplina {
	@Id
	private String nome;
	private Long id;
	private String professor;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public Disciplina(String nome, Long id, String professor) {
		super();
		this.nome = nome;
		this.id = id;
		this.professor = professor;
	}
	public Disciplina() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Disciplina [nome=" + nome + ", id=" + id + ", professor=" + professor + "]";
	}

}
