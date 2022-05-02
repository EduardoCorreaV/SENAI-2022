
public class Eduardo_1DN {

	public static void main(String[] args) {
		
		Carro m4 = new Carro();
		m4.cor = "Preto";
		m4.marca = "BMW";
		m4.modelo = "AMG";
		m4.nrPortas = 4;
		m4.meuMotor = new Motor();
				
		System.out.println("A sua velocidade atual é de: " + m4.acelerar());
		System.out.println("A sua velocidade atual é de: " + m4.acelerar());
		System.out.println("A sua velocidade atual é de: " + m4.frear());
		
	}
}
