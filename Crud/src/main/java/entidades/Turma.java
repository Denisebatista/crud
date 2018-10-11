package entidades;

public class Turma {
	
	private Long id;
	private String nome;
	private Professor professor;
	private Disciplina disciplina;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	@Override
	public String toString() {
		return "Turma [id=" + id + ", nome=" + nome + ", professor=" + professor + ", disciplina=" + disciplina + "]";
	}
	
	public Turma(Long id, String nome, Professor professor, Disciplina disciplina) {
		super();
		this.id = id;
		this.nome = nome;
		this.professor = professor;
		this.disciplina = disciplina;
	}
	
	public Turma() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
