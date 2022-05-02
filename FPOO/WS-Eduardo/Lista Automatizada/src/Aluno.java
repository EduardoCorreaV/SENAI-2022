
public class Aluno extends Pessoa{
	
	private long matricula;
	private String turma;
	
	public Aluno(String nome, String cpf, String rg, String dtNas,  String turma, long matricula) {
		super(nome, cpf, rg, dtNas);
		this.matricula = matricula;
		this.turma = turma;	
	}
	
	public double getMatricula() {
		return matricula;
	}
	
	public String getTurma() {
		return turma;	
	}
	
	public void setTurma(String turma) {
		this.turma = turma;
	} 
}
