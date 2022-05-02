public class Aluno extends Pessoa {
	private String ra;

	public Aluno(String nome, String ra) {
		super(nome);
		this.ra = ra;
	}

	@Override
	public String toString() {

		return "Nome: " + this.getNome() + " RA: " + this.getRa();
	}

	@Override
	public boolean equals(Object obj) {
		Aluno aNovo = (Aluno) obj;

		if (this.ra.equals(aNovo.ra))
			return true;
		else
			return false;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}
}
