import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni k1: ");
        char k1 = sc.next().charAt(0);
        System.out.println("Vendosni k2: ");
        char k2 = sc.next().charAt(0);

        int a1 = k1; //konvertohet nga char ne int (shikoni tabelen ascii)
        int a2 = k2;

        System.out.println("Karakteri " + k1 + " : " + a1);
        System.out.println("Karakteri " + k2 + " : " + a2);
        System.out.println(a2 - a1 - 1);
    }
}
