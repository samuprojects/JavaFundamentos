import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Aplicacao {

	public static void main(String[] args) {

		periodSinceJamesGoslingBirthday();
		durationSince3AM();
	}
	
	private static void periodSinceJamesGoslingBirthday() {
		LocalDate birthday = LocalDate.parse("1955-05-19");
		
		LocalDate today = LocalDate.now();
		
		Period period = Period.between(birthday, today);
		
		System.out.println((String.format("%d anos, %d meses e %d dias", period.getYears(), period.getMonths(), period.getDays())));
	}
	
	private static void durationSince3AM() {
		LocalTime earlier = LocalTime.parse("03:00");
		
		LocalTime now = LocalTime.now();
		
		Duration duration = Duration.between(earlier, now);
		
		System.out.println(String.format("%d segundos", duration.getSeconds()));
	}

}
