
public class Aplicacao {
	
	public static void main(String[] args) {
		
		Semaforo semaforo = new Semaforo();
		semaforo.start();
		
		int numCarros = 10;
		
		Carro[] carros = new Carro[numCarros];
		
		for (int i = 0; i < numCarros; i++) {
			
			carros[i] = new Carro(i + 1, semaforo);
			carros[i].start();
			
		}
	}

}
