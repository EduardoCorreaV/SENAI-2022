import javax.swing.JOptionPane;

public class MainDeposito {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente("Lais","0000-2","222-3",1000000);
		
		JOptionPane.showMessageDialog(null, conta);
		
//		conta.depositar(200.0);
//		System.out.println("O saldo � de: " + conta.getSaldo());
//		
//		conta.sacar(100.0);
//		System.out.println("O saldo ap�s a transa��o � de: " + conta.getSaldo());
		
	}
}
