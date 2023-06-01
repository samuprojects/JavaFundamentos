
public class Calculador {
	
	public static final int NUM_THREADS = 2;
	
	public static final int NUM_ITERACOES = 100000000;

	public static void main(String[] args) throws Exception {
		
		double[] parciais = new double[NUM_THREADS];
		
		CalculadorParcial[] threads = new CalculadorParcial[NUM_THREADS];
		
		long initTime = System.currentTimeMillis();
		
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new CalculadorParcial(i, parciais);
			threads[i].start();
		}
		
		for (int i = 0; i < threads.length; i++) {
			threads[i].join();
		}
		
		long finishTime = System.currentTimeMillis();
		
		double pi = 0;
		for (double parcial : parciais) {
			pi += parcial;
		}
		pi *= 4;
		
		System.out.println("Valor de PI = " + pi);
		System.out.println("Tempo: " + (finishTime - initTime) + "ms");
		
	}

}
