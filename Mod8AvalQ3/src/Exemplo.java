public class Exemplo {
	public static void read() throws Exception {
		throw new IOException();
	}

	public static void main(String[] args) throws Exception {
		try {
			read();
		} catch (FileNotFoundException f) {
			System.out.println("catch 2");
		} finally {
			System.out.println("finally");
		}
	}
}