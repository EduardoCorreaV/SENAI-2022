
public class Livro {

	private int isbn;
	private String titulo;
	private String autor;
	private int qtdPaginas;

	public Livro(int isbn, String titulo, String autor, int qtdPaginas) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.qtdPaginas = qtdPaginas;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getQtdPaginas() {
		return qtdPaginas;
	}

	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}
}
