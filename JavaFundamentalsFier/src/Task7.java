import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni nje numer");
        int nrPerdorues = sc.nextInt();
        int pozicioni = 1;
        int nrAktual = 1;
        int nrParaardhes = 0;
        int nrFib = 0;

        //Fibbonaci eshte nje varg ku numri pasardhes eshte i barabarte me shumen e dy numrave paraardhes.
        //Pra: 1, 1, 2, 3, 5, 8...
        //Do te perseritet per aq kohe sa pozicioni te jete me i vogel se nr i vendosur nga perdoruesi
        while(pozicioni < nrPerdorues) {
            nrFib = nrAktual + nrParaardhes;
            nrParaardhes = nrAktual;
            nrAktual = nrFib;
            pozicioni++;
            System.out.println(nrAktual);
        }

        System.out.println(nrFib);
    }
}
