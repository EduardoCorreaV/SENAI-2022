
public class Main {

	public static void main(String[] args) {
		
		Carro m3 = new Carro();
		m3.setCor("Branco");
		m3.setConversivel(false);
		m3.setPlaca("EBS7I42");
		
		System.out.println(m3.getCor());
		System.out.println(m3.getPlaca());
	}
}