
public class Aplicacao {

	public static void main(String[] args) throws Exception {
		
		ContaBancaria c = new ContaBancaria(1000);		
		
			try {
				c.sacar(-300);
				System.out.println("Saque foi realizado com sucesso");
				
			} catch (ValorNegativoException e) {
				System.out.println("Valor Negativo");
				
			} finally {
				System.out.println(c.getSaldo());
			}		
	}
}
