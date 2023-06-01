
public class Aplicacao {

	public static void main(String[] args) {
		
		Banco banco = new Banco();		
		
			try {
				banco.realizarOperacao();
				
			} catch (Exception e) {
				System.out.println("Ocorreu um erro: " + e.getMessage());
			}
			
		
	}
}
