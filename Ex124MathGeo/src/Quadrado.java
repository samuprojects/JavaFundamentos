
public class Quadrado extends Figura {
	
	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	public double calcularArea() {
		return lado * lado;
	}

}
