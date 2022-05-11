import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leia2 = new Scanner(System.in);

		int isbnInfo = 0;
		String autorInfo = "";
		String tituloInfo = "";
		int qtdPagsInfo = 0;
		int opcao = 0;
		int escolha = 0;
		String escolha2 = "";
		boolean novamente = true;

		Biblioteca nova = new Biblioteca();

		System.out.println("Bem vindo a Biblioteca Intergalatica de Kashyyk");

		do {
			System.out.println("O que deseja realizar hoje? ");

			System.out.println("1. ADICIONAR LIVRO");
			System.out.println("2. EXCLUIR LIVRO");
			System.out.println("3. ALTERAR LIVRO");
			System.out.println("4. LOCALIZAR LIVRO");
			System.out.println("5. IR EMBORA");

			opcao = leia.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Digite o Titulo do Livro: ");
				tituloInfo = leia2.nextLine();

				System.out.println("Digite o ISBN do Livro");
				isbnInfo = leia.nextInt();

				System.out.println("Digite o Autor do Livro");
				autorInfo = leia2.nextLine();

				System.out.println("Digite a Quantidade de páginas do Livro");
				qtdPagsInfo = leia.nextInt();

				Livro novo = new Livro(isbnInfo, tituloInfo, autorInfo, qtdPagsInfo);

				nova.adicionar(novo);
				break;

			case 2:
				System.out.println("Digite a ISBN do Livro que deseja excluir: ");
				escolha = leia.nextInt();
				int pos = nova.localizarPorIsbn(escolha);
				if (pos > -1)
				nova.excluir(pos);
				break;

			case 3:
				System.out.println("Digite o título que deseja alterar");
				tituloInfo = leia2.nextLine();
				int posicao = nova.localizarPorTitulo(tituloInfo);

				System.out.println("Digite o Titulo do Livro: ");
				tituloInfo = leia2.nextLine();

				System.out.println("Digite o ISBN do Livro");
				isbnInfo = leia.nextInt();

				System.out.println("Digite o Autor do Livro");
				autorInfo = leia2.nextLine();

				System.out.println("Digite a Quantidade de páginas do Livro");
				qtdPagsInfo = leia.nextInt();

				Livro livro = new Livro(isbnInfo, tituloInfo, autorInfo, qtdPagsInfo);

				nova.alterar(posicao, livro);
				break;

			case 4:
				System.out.println("localizar por titulo");
				escolha2 = leia2.nextLine();
				System.out.println(nova.localizarPorTitulo(escolha2));
				break;

			case 5:
				novamente = false;
				break;
			}

		} while (novamente);
			System.out.println("Operação finalizada!");
	}
}
