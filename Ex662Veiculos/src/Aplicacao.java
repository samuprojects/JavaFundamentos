
public class Aplicacao {

	public static void main(String[] args) {
		
		Veiculo v1 = new Automovel();
		v1.ligar();
		System.out.println(v1.isLigado());
		v1.desligar();
		System.out.println(v1.isLigado());
		
		Veiculo v2 = new Motocicleta();
		v2.ligar();
		System.out.println(v2.isLigado());
		v2.desligar();
		System.out.println(v2.isLigado());
		
		Veiculo v3 = new Onibus();
		v3.ligar();
		System.out.println(v3.isLigado());
		v3.desligar();
		System.out.println(v3.isLigado());

	}

}
