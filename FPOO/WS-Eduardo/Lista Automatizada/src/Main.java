
public class Main {

	public static void main(String[] args) {
	
	Lista lista = new Lista();	
		
	Aluno aluno = new Aluno("Eduardo", "123.456.789-00", "12.345.678-90", "14/03/1987", "2DN", 98876 );
	
	Aluno aluno2 = new Aluno("Lais", "012.345.678-90", "01.234.567.-89", "24/04/1997", "1DN", 98067 );
	
	lista.adicionar(aluno);
	lista.adicionar(aluno2);
	
	System.out.println(aluno.getNome());
	System.out.println(aluno2.getNome());
	
	}
}
