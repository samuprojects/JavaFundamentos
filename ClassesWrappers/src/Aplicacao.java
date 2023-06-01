
public class Aplicacao {

	public static void main(String[] args) {

		Integer i = Integer.valueOf(20);
		imprimir(i);
		
		Double d = Double.valueOf(23.5);
		imprimir(d);
		
		int i2 = i.intValue();
		double d2 = d.doubleValue();
		System.out.println(i2 + " " + d2);
		
		Integer i3 = Integer.valueOf("20");
		Double d3 = Double.valueOf("23.5");
		System.out.println(i3 + " " + d3);
		
		int i4 = Integer.parseInt("20");
		double d4 = Double.parseDouble("23.5");
		System.out.println(i4 + " " + d4);
		
		String bin = "0111";
		int i5 = Integer.parseInt(bin, 2);
		System.out.println(i5);
		
		String bin2 = Integer.toBinaryString(7);
		System.out.println(bin2);
		
		imprimir(100);	//autoboxing	
	}
	
	private static void imprimir(Object obj) {
		System.out.println(obj);
	}
}