package entidades;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Aluno implements Indentificavel {
	
	@Id
	@GeneratedValue(generator="aluno_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="aluno_seq")
	private Long id;
	private String cpf;
	private int telefone;
	
	private ArrayList<Turma> turma;

	public ArrayList<Turma> getTurma() {
		return turma;
	}

	public void setTurma(ArrayList<Turma> turma) {
		this.turma = turma;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aluno(Long id, String cpf, int telefone, ArrayList<Turma> turma) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.telefone = telefone;
		this.turma = turma;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", cpf=" + cpf + ", telefone=" + telefone + ", turma=" + turma + "]";
	}


}
