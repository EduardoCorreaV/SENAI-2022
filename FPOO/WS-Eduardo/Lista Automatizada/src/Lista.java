
public class Lista {
	private Aluno[] vetor = new Aluno[5];
	private int nrVaga = 0;
	private int tam = 0;

	public int tamanho() {
		return tam;
	}

	public void adicionar(Aluno valor) {

		if (tam == vetor.length) {
			Aluno[] vetAux = new Aluno[tam * 2];
			for (int i = 0; i < vetor.length; i++) {
				vetAux[i] = vetor[i];
			}
			vetor = vetAux;
		}

		vetor[nrVaga] = valor;
		nrVaga++;
		tam++;
	}

	public void alterar(int pos, Aluno valor) {
		vetor[pos] = valor;
	}

	public void alterar(String valorAtual, Aluno valor) {
		int indice = localizar(valorAtual);
		if (indice >= 0)
			vetor[localizar(valorAtual)] = valor;
	}

	public void excluir(int pos) {
		for (int i = pos; i < tamanho() - 1; i++) {
			vetor[i] = vetor[i + 1];
		}
		vetor[tamanho() - 1] = null;
		tam--;
	}

	public int localizar(String nome) {
		for (int i = 0; i < tamanho(); i++) {
			if (vetor[i].getNome().equalsIgnoreCase(nome)) {
				return i;
			}
		}
		return -1;
	}

	public int localizar(String cpf, double matricula, String rg) {
		for (int i = 0; i < tamanho(); i++) {
			if (vetor[i].getMatricula() == matricula || vetor[i].getCpf().equals(cpf) || vetor[i].getRg().equals(rg)) {
				return i;
			}
		}
		return -1;

	}

	public Aluno mostrar(int pos) {
		return vetor[pos];
	}
}
