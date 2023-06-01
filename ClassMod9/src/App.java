import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class App {
	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		LocalTime t = LocalTime.now();		
		System.out.println(d);
		System.out.println(t);
		
		LocalDate e = LocalDate.of(2020, Month.DECEMBER, 10);
		LocalTime f = LocalTime.of(13, 45, 0);		
		System.out.println(e);
		System.out.println(f);
		
		LocalDate d1 = d.plusDays(5);
		LocalDate d2 = d.minus(1, ChronoUnit.WEEKS);		
		System.out.println(d1);
		System.out.println(d2);
		
		LocalTime t2 = t.plusHours(2).plusMinutes(30);
		LocalTime t3 = t.minus(100, ChronoUnit.MILLIS);
		System.out.println(t2);
		System.out.println(t3);
		
		Period p = Period.of(0, 1, 7);
		LocalDate z = LocalDate.now().plus(p);
		System.out.println(z);
		
		
	}

}
