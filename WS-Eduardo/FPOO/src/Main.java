
public class Main {

	public static void main(String[] args) {

		Turma turma = new Turma("1DN", 2, 4);
		System.out.println("O nome da sau turma é: " + turma.nome);

		turma.alunos[0] = new Aluno("Eduardo", "111.222.333.44");
		turma.alunos[1] = new Aluno("Lais", "222.333.444-55");

		turma.professores [0] = new Professor("Bitt", "FPOO");
		turma.professores [1] = new Professor("James", "HARE");
		turma.professores [2] = new Professor("Danilo", "SOP");
		turma.professores [3] = new Professor("Julio", "LIMA");
		
		System.out.println(turma.listaAlunos());
		System.out.println(turma.listaProfessores());
	}
}
