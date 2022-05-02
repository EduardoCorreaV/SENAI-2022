
public class Turma {

	String nome;
	Aluno[] alunos;
	Professor[] professores;

	public Turma(String nome, int qtdeAlunos, int qtdeProf) {
		this.nome = nome;
		this.alunos = new Aluno[qtdeAlunos];
		this.professores = new Professor[qtdeProf];

	}

	public String listaAlunos() {
		String listaA = "";
		for (int x = 0; x < alunos.length; x++) {
			listaA += alunos[x].nome + "\n";
	}
		return listaA;
}

	public String listaProfessores() {
		String listaProf = "";
		for (int x = 0; x < professores.length; x++) {
			listaProf += professores[x].nome + "\n";
			
		}
		return listaProf;
	}
}
