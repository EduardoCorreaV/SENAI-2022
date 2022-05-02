
public class Main {

	public static void main(String[] args) {
		
		DesafioLista edu = new DesafioLista();
		edu.add("tela");
		edu.add("note");
		edu.add("tenis");
		edu.add("garrafa");
		edu.add("caderno");
		edu.add("celular");
		edu.add("cpu");
		edu.add("chinelo");
		edu.add("camera");
		edu.add("mouse");

		System.err.println("Este é o tamanho da sua lista " + edu.tamanho());
		//imprime o valor em vermelho! 
		
		System.out.println("Este é o conteúdo da sua lista " + edu.mostrarLista());
		
		int posicao;
		if ((posicao = edu.buscarNome("cpu")) < 0)
			System.out.println("Moio, não deu errado");
		else
			edu.alterar(3, "bottle of water");
					
		if(edu.alterar(1, "bala"))
			System.out.println("Sucesso na alteração");
		else
			System.err.println("Não foi possível alterar o valor");
		
		System.out.println(edu.excluir(0));
		System.out.println("A lista tem os seguintes conteúdos " + edu.mostrarLista());
		System.out.println("O item na posição escolhida é: " + edu.mostarItem(1));
	}
}
