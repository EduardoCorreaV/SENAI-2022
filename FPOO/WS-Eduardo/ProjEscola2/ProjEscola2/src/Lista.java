
public class Lista {
	private Aluno[] vetor;
	private int posicaoVaga = 0;
	private int qtd = 0;

	public Lista() {
		vetor = new Aluno[3];
	}

	public Lista(int tamInicial) {
		vetor = new Aluno[tamInicial];
	}

	public int tamanho() {
		return qtd;
	}

	public void adicionar(Aluno valor) {

		if (qtd == vetor.length) {
			Aluno[] vetAux = new Aluno[qtd * 2];
			for (int i = 0; i < vetor.length; i++) {
				vetAux[i] = vetor[i];
			}
			vetor = vetAux;
		}

		vetor[posicaoVaga] = valor;
		posicaoVaga++;
		qtd++;
	}

	public void alterar(int pos, Aluno valor) {
		vetor[pos] = valor;
	}

	public void excluir(int pos) {
		for (int i = pos; i < tamanho() - 1; i++) {
			vetor[i] = vetor[i + 1];
		}
		vetor[tamanho() - 1] = null;
		qtd--;
	}

	public int localizar(Aluno aluno) {
		for (int i = 0; i < tamanho(); i++) {
			if (vetor[i].equals(aluno)) {
				return i;
			}
		}
		return -1;
	}

	public Aluno mostrar(int pos) {
		return vetor[pos];
	}

}
