public class ContaCorrente {

	private String titular;
	private String conta;
	private String agencia;
	private double saldo = 0;

	public ContaCorrente(String titular, String conta, String agencia, double saldo) {

		this.titular = titular;
		this.conta = conta;
		this.agencia = agencia;
		depositar(saldo);

	}

	public double depositar(double valor) {
		this.saldo += valor;
		return saldo;
	}

	public boolean sacar(double valor) {
		if (saldo > 0) {
			this.saldo -= valor;
			return true;
			
		} else {
			return false;
		}
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
