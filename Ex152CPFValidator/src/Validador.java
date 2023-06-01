import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validador {
	
	public static boolean validarCPF(String cpf) {
		String regex = "\\d\\d\\d([\\.\\s])?\\d\\d\\d([\\.\\s])?\\d\\d\\d([-\\s])?\\d\\d";
		return validarRegex(cpf, regex);
		
	}
	
	public static boolean validarTelefone(String telefone) {
		String regex = "(\\(\\d\\d\\))?\\s*\\d\\d\\d\\d([-\\s])?\\d\\d\\d\\d";
		return validarRegex(telefone, regex);
	}
	
	private static boolean validarRegex(String str, String regex) {
		if(str == null) {
			return false;
		}
		
		Pattern p  = Pattern.compile(regex);
		
		Matcher m = p.matcher(str);
		
		return m.matches();
	}

}
