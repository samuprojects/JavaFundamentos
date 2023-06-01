import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Aplicacao {

	public static void main(String[] args) {

		Duration d = Duration.of(45, ChronoUnit.MINUTES);
		LocalDateTime ldt1 = LocalDateTime.of(2020, Month.MAY, 5, 16, 0);
		LocalDateTime ldt2 = ldt1.plus(d);
		String s = ldt2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		System.out.println(s);
	}
}
