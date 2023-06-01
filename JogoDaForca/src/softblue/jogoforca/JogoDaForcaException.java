package softblue.jogoforca;

@SuppressWarnings("serial")
public class JogoDaForcaException extends Exception {
	
	public JogoDaForcaException(String message) {
		super(message);
	}
	
	public JogoDaForcaException(String message, Throwable cause) {
		super(message, cause);
	}
}
