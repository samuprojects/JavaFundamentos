
public class Executor {

	public static void main(String[] args) {
		
		Colecao c1 = new Pilha();
		manipularDados(c1);
		
		Colecao c2 = new Fila();
		manipularDados(c2);
	}
	
	private static void manipularDados(Colecao c) {
		c.inserirItem("A");
		c.inserirItem("B");
		c.inserirItem("C");
		
		String i1 = (String) c.removerItem();
		String i2 = (String) c.removerItem();
		String i3 = (String) c.removerItem();
		
		System.out.print(i1 + ", " + i2 + ", " + i3);
		System.out.println();
		}

}
