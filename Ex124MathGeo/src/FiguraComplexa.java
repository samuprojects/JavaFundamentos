
public class FiguraComplexa extends Figura {
	
	private Figura[] figuras;
	
	public FiguraComplexa(Figura[] figuras) {
		this.figuras = figuras;
	}
	
	public double calcularArea() {
		double areaTotal = 0.0;
		
		for (int i = 0; i < figuras.length; i++) {
			areaTotal += figuras[i].calcularArea();
		}
		return areaTotal;
	}

}
