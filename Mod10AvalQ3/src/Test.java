class Util{
	  public enum Status { ATIVO, INATIVO, EXCLUIDO }
	  }
public class Test {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Util.Status s = Util.Status.ATIVO;		
		System.out.println(s);
		
		
		Long l1 = new Long(1);
		Long l2 = new Long(1);
		
		System.out.println(l1 == l2);
		System.out.println(l1.equals(l2));
		System.out.println(1 == l2);
		}

}
