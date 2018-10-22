package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Disciplina {
	@Id
	@Column(name = "id_disc")
	private Integer id_disciplina;
	private String nome;
	private String professor;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdDisciplina() {
		return id_disciplina;
	}
	public void setIdDisciplina(Integer id_disciplina) {
		this.id_disciplina = id_disciplina;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	@Override
	public String toString() {
		return "Disciplina [nome=" + nome + ", id=" + id_disciplina + ", professor=" + professor + "]";
	}

}
