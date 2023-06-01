
public class Aplicacao {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Exemplo e1 = new Exemplo();
		Exemplo e2 = new Exemplo();
		
		System.out.println(e1.contador);
		System.out.println(e2.contador);
		System.out.println(Exemplo.contador);

	}

}
