
public class Carro {

	String marca;
	String modelo;
	String cor;
	int nrPortas;
	int velocidade = 0;
	Motor meuMotor;
	
	
	public int acelerar() { 

		return velocidade += meuMotor.aceleracao;

	} 
	
	public int frear() { 
		
		if (velocidade > 0)
			return velocidade -= meuMotor.aceleracao;
		else
			return velocidade;

	} 
	
	public void re() { 
		
	}
}
