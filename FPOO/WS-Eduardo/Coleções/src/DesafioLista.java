import java.util.*;

public class DesafioLista {

	private String[] vetor = new String[10];
	private int posVaga = 0;
	
	public void add(String valor) {
	vetor[posVaga] = valor;	
	posVaga++;
	}
	
	public String excluir (int posicao) {
		String resp = vetor[posicao];
		for(int x = posicao; x < tamanho()-1;x++) {
		 vetor[x] = vetor[x+1];
		}
		 vetor[tamanho()-1]= null;
		 posVaga--;
		 return resp;
	}
	
	public boolean alterar(int i, String valor) {

		if (i < posVaga) {
		vetor[i] = valor;
		return true;
	}else {
		return false;
	}
}
	
	public String mostrarLista () {
		String lista = "";
			for(int x = 0; x < vetor.length; x++) {
				lista += vetor[x] + "\n";
		}
			return lista;
	}
	
	public String mostarItem (int y) {
		return vetor[y];	
	}
	
	public int tamanho() {
		return posVaga;
	}
	
	public int buscarNome(String valor) {
	for (int i = 0; i < vetor.length; i++) {
		if (vetor[i].equals(valor))
			return i;
	}
	return-1;
}

}