
public class Biblioteca {
	private Livro[] vetor = new Livro[10];
	private int posVaga = 0;

	public int tamanho() {
		return posVaga;
	}

	public void adicionar(Livro valor) {
		if (posVaga == vetor.length) {
			Livro[] vetAux = new Livro[posVaga * 2];
			for (int i = 0; i < tamanho(); i++) {
				vetAux[i] = vetor[i];

			}
			vetor = vetAux;
		}

		vetor[posVaga] = valor;
		posVaga++;
	}

	public void excluir(int pos) {
		for (int i = pos; i < tamanho() - 1; i++) {
			vetor[i] = vetor[i + 1];
		}
		vetor[tamanho() - 1] = null;
		posVaga--;
	}
	
	public void alterar(int pos, Livro valor) {
		vetor[pos] = valor;
	}

	public int localizarPorTitulo(String escolha2) {
		for (int i = 0; i < tamanho(); i++) {
			if (vetor[i].getTitulo().equals(escolha2)) {
				return i;
			}
		}
		return -1;
	}
	
	public int localizarPorIsbn(int isbn) {
		for (int i = 0; i < tamanho(); i++) {
			if (vetor[i].getIsbn() == isbn) {
				return i;
			}
		}
		return -1;
	}
}
