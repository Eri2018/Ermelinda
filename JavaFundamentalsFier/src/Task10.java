import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt(); //psh marrim nr 12

        //per aq kohe sa numri eshte > 0
        while (num > 0) {
            sum += num % 10; //shuma = shuma + mbetja e numrit te pjesetuar me 10 (12 % 10 = 2)
            num = num / 10; //numri zvogelohet (num = 12 / 10 = 1)
        }
        System.out.println(sum);
    }
}
