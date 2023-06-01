import java.util.ArrayList;
import java.util.List;

public class Exemplo {

	public static void read() throws Exception{
		List<String> l = new ArrayList<String>();
	    l.add("1");
	    l.add("2");
	   // l.add(3); erro na linha, questão ok.
	    
	    for(String s : l) {
	        System.out.println(s);
	    }

	}

}
