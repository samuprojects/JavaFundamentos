import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aplicacao {

	public static void main(String[] args) {

		Pattern p = Pattern.compile("\\\\");
		Matcher m = p.matcher("a\\b\\c\\d");

		while (m.find()) {
			int pos = m.start();
			System.out.print(pos + " ");
		}	}

}
