package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "turma")
public class Turma {
	
	@Id
	@Column(name = "id_turma")
	private Integer id_turma;

	private String professor;
	private Integer disciplina;
	public Integer getId_turma() {
		return id_turma;
	}
	public void setId_turma(Integer id_turma) {
		this.id_turma = id_turma;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public Integer getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Integer disciplina) {
		this.disciplina = disciplina;
	}
	@Override
	public String toString() {
		return "Turma [id_turma=" + id_turma + ", professor=" + professor + ", disciplina=" + disciplina + "]";
	}

}