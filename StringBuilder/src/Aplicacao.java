
public class Aplicacao {

	public static void main(String[] args) {
		
//		String s = "";
//		
//		for (int i = 0; i < 1000; i++) {
//			s = s + "X";
//		}
//		
//		System.out.println(s);
		
	StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 1000; i++) {
			sb.append("X");
		}
		
		String s = sb.toString();
		
		System.out.println(s);
		
		System.out.println("A" + "B" + "C" + "D");
	}
}
