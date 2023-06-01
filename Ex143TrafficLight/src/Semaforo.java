
public class Semaforo extends Thread {
	
	private static final int TEMPO_SEMAFORO = 3000;
	
	private enum Cor {
		VERDE,
		VERMELHA		
	}
	
	private Cor cor = Cor.VERMELHA;
	
	@Override
	public void run() {
		
		while(true) {
			mudarCor();
			
			try {
				Thread.sleep(TEMPO_SEMAFORO);
			} catch (InterruptedException e) {
			}
		}
	}
	
	public synchronized void atravessar(Carro carro) {
		
		while (cor == Cor.VERMELHA) {
			carro.mostrarMensagem("Está aguardando no semáforo");
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}		
	}
	
	public synchronized void mudarCor() {
		
		if(cor == Cor.VERDE) {
			cor = Cor.VERMELHA;
		} else {
			cor = Cor.VERDE;
			notifyAll();
		}
		
		System.out.println("Cor do semáforo: " + cor);
		
	}

}
