
public class CalculadorParcial extends Thread {
	
	private int id;
	
	private double[] parciais;
	
	/**
	 * Construtor
	 * @param id ID da thread
	 * @param parciais Array de resultados parciais 
	 */
	public CalculadorParcial(int id, double[] parciais) {
		this.id = id;
		this.parciais = parciais;
	}
	
	/**
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
		double soma = 0;
		
		for (int i = id; i < Calculador.NUM_ITERACOES; i += Calculador.NUM_THREADS) {
			int s;
			if (i % 2 == 0) {
				s = 1;
			} else {
				s = -1;
			}
			
			soma += (double) s / (2 * i + 1);
		}
		
		parciais[id] = soma;
		
	}

}
