import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        System.out.println("Vendosni nje date ne formatin yyyy-MM-dd: ");
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        LocalDate dt = LocalDate.parse(data);
        // LocalDate.now() -> kthen daten e 'tanishme' qe merr nga sistemi
        LocalDate dataSot = LocalDate.now();
        //ChronoUnit.DAYS.between -> llogarit ditet mes dy datave
        long ditetENgelura = ChronoUnit.DAYS.between(dataSot, dt);
        System.out.println("Ditet e ngelura: " + ditetENgelura);
    }
}
