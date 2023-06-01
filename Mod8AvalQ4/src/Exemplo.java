
public class Exemplo {

	public static void main(String[] args) {
		try {
			throw new NullPointerException();
		} catch (NullPointerException ne) {
			System.out.print("1 ");
		} catch (RuntimeException re) {

			System.out.print("2 ");

		} finally {
			System.out.print("3 ");

		}
	}
}
