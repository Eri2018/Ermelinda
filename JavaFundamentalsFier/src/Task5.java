import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nr = sc.nextInt();
        for(int i = 1; i < nr; i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    //llogarit nese numri eshte i thjeshte
    //numri i thjeshte ka mbetje zero kur pjestohet me 1 dhe me veten. Psh: 2, 3, 5, 7, 11 etj.
    //kjo metode kthen nje boolen (true ose false). Nese numri eshte i thjeshte kthejme true perndryshe kthejme false
    private static boolean isPrime(int i) {
        if(i == 1)
            return false;
        for(int j = 2; j < i; j++) {
            if (i % j == 0)
                return false;
        }
        return true;
    }
}
