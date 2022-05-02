
public class Main {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Jessica", "0001");
		Aluno a2 = new Aluno("Alexandre", "0002");

		System.out.println(a1);

		Lista lista = new Lista();

		lista.adicionar(a1);
		lista.adicionar(a2);

		Aluno temp = new Aluno("Alexandre", "0002");
		lista.localizar(temp);

	}
}
