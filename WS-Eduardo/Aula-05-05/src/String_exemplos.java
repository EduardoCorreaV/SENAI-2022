
public class String_exemplos {

	public static void main(String[] args) {
		String[] vetor = "Pera;Maçã;Laranja;Uva;Pessego;".split(";");
		
		int i = 798;
		
		short s = 123;
		
		byte b = -127;
		
		float f = 1.5f;
		
		char c = 'y';
		
		long l = 1000;
		
		boolean boo = true;
		
		double d = 2.3;
		Double wd = 2.3;
		double xaxa = Double.valueOf("2344.90"); //CONVERSÃO!!
		
		
		//----------------------------------------------\\
		

		String palavra = "00946335992";

		char[] vetorChar = palavra.toCharArray();

		boolean existeH = palavra.contains("993");
		
		String respEmPalavra = String.valueOf(existeH);
		
		String newWord = palavra.concat(" LALA LAND");
		
		char x = newWord.charAt(5);
		
		String novaPalavra = newWord.replace('0','Z');
		
		String pedaco1 = novaPalavra.substring(9);
		
		String pedaco2 = novaPalavra.substring(11,16);
		
		String wordLimpa = pedaco2.trim();
		
	}
}
