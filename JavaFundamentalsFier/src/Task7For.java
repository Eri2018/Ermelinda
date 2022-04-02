import java.util.Scanner;

public class Task7For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni pozicionin ");
        int nr = sc.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 0; i < nr; i++){
            int x = a + b;
            a = b;
            b = x;
        }
        System.out.println(a);
    }
}
