import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni 3 koeficentet: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double dallori = Math.pow(b, 2) - (4 * a * c);
        if(dallori < 0) {
            System.out.println("Delta negative");
        } else if(dallori == 0) {
            double x = -b/(2*a);
            System.out.println("Koeficenti x: " + x);
        } else {
            double x1 = (-b - Math.sqrt(dallori))/(2*a);
            double x2 = (-b + Math.sqrt(dallori))/(2*a);
            System.out.println("Koeficenti x1: " + x1);
            System.out.println("Koeficenti x2: " + x2);
        }
    }
}
