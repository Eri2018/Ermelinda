import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jepni nje fjale");
        String text = scanner.nextLine();

        //^acho+! -> ^acho percakton qe fjala te filloje me acho
        // o+ percakton qe o perseritet minimumi 1 here
        Pattern pattern = Pattern.compile("^acho+!");
        Matcher matcher = pattern.matcher(text);
        if (matcher.matches() == true) {
            System.out.println("You sneezed");
        } else {
            System.out.println("You didn't sneeze");
        }

    }
}
