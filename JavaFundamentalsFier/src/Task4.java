import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numer = sc.nextInt();

        //Me ane te ketij loop kontrollojme nese numri i vendosur eshte < 1.
        //Nese eshte < 1 atehere i kerkojme perdoruesit te vendose nje numer me te madh ose te = me 1
        //Perseritet derisa numri i vendosur te jete >= 1
        while(numer < 1) {
            System.out.println("Vendosni nje numer >= 1");
            numer = sc.nextInt();
        }
        //iterojme nga nr 1 deri ne nr e vendosur nga perdoruesi
        for(int i = 1; i <= numer; i++) {
            //nese i / 3 e ka mbetjen 0 dhe i / 7 e ka mbetjen 0 atehere printohet Fizz Buzz
            if((i % 3 == 0) && (i % 7 ==0)) {
                System.out.println("Fizz Buzz");
            } else if(i % 3 == 0) {
                System.out.println("Fizz");
            } else if(i % 7 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
