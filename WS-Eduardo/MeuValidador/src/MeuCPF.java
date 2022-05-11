import java.util.*;

public class MeuCPF {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		// CONVERSÕES E REPLACE
		System.out.println("Digite o seu cpf com os digitos, por favor!");
		String cpf = leia.nextLine();
		String novoCpf = cpf.replace(".", "").replace("-", "");
		char[] vetChar = novoCpf.toCharArray();

//----------------------------------------------------------------------------------------------------------------------\\
		// DIGITO 1
		int num;
		int soma = 0;
		
		//for (int i = 0, m = 10; i < vetChar.length - 2; i++, m--), dai seria necessário exclui a linha 22
		
		for (int i = 0; i < vetChar.length - 2; i++) {
			num = Integer.valueOf(String.valueOf(vetChar[i]));

			soma += num * (10 - i);
		}

		System.out.println("A soma dos valores são: " + soma);

		int resto = soma % 11;
		System.out.println("O seu resto é: " + resto);

		if (resto < 2)
			System.out.println("O seu digito é: " + 0);
		else
			System.out.println("O seu digito é: " + (11 - resto));

//-----------------------------------------------------------------------------------------------------------------------\\

		// DIGITO 2
		int num2 = 0;
		int soma2 = 0;
		
		//for (int i = 0, m = 11; i < vetChar.length - 2; i++, m--), dai seria necessário exclui a linha 44
		
		for (int i = 0; i < vetChar.length - 1; i++) {
			num2 = Integer.valueOf(String.valueOf(vetChar[i]));

			soma2 += num2 * (11 - i);
		}

		System.out.println("A soma dos valores são: " + soma2);

		int resto2 = soma2 % 11;
		System.out.println("O seu resto é: " + resto);

		if (resto2 < 2)
			System.out.println("O seu digito é: " + 0);
		else
			System.out.println("O seu digito é: " + (11 - resto2));

	}
}
