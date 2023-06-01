
public class Aplicacao {

	public static void main(String[] args) {
		Cor cor1 = new Vermelho();
		Vermelho cor2 = new Vermelho();
		boolean b1 = cor1 instanceof Cor;
		boolean b2 = cor1 instanceof Azul;
		boolean b3 = cor2 instanceof Object;
		System.out.println(b1 + ", " + b2 + ", " + b3);

	}

}
