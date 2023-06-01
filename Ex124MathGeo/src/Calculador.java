
public class Calculador {

	public static void main(String[] args) {
		
		Quadrado q1 = new Quadrado(3.0);
		Quadrado q2 = new Quadrado(10.0);
		
		Retangulo r1 = new Retangulo(2.0, 7.0);
		Retangulo r2 = new Retangulo(5.0, 3.0);
		
		Figura[] figuras = {q1, q2, r1, r2};
		
		FiguraComplexa figuraComplexa = new FiguraComplexa(figuras);
		
		double area = figuraComplexa.calcularArea();
		
		System.out.println("Área da figura: " + area);
	}

}
