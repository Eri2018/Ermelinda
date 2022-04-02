import java.util.Random;
import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Random r = new Random();

        //r.nextInt(101) -> gjeneron nje numer random nga 1 - 100.
        //Vendosim si parameter 101 pasi vete metoda nuk e perfshin numrin e fundit, pra 101 (eshte exclusive)
        int nrRandom = r.nextInt(101);
        System.out.println(nrRandom);
        Scanner scanner = new Scanner(System.in);
        int numri;
        do {
            numri = scanner.nextInt();
            if (numri > nrRandom) {
                System.out.println("Too high");
            } else if (numri < nrRandom) {
                System.out.println("Too little");
            }
        } while (nrRandom != numri); //vazhdon per aq kohe sa numri i vendosur nga perdoruesi
                                    // eshte i ndryshem nga ai i gjeneruari random
        System.out.println("Congratulations");
    }
}
