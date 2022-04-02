import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char veprimi = sc.next().charAt(0);
        System.out.print("Nr1: ");
        float nr1 = sc.nextFloat();
        System.out.println("Nr2: ");
        float nr2 = sc.nextFloat();

        //Per aq kohe sa karakteri i veprimi eshte "pjesetim" dhe emeruesi eshte 0
        //do te kerkojme qe te vendoset nje numer tjeter
        while(Character.compare(veprimi, '/') == 0 && nr2 == 0) {
            System.out.println("Numri 2 nuk mund te jete 0: ");
            nr2 = sc.nextFloat();
        }

        float result = 0;

        //Me ane te switch kontrollojme nese veprimi perket me nje nga rastet e percaktuar (+ - * /)
        switch (veprimi) {
            case '+':
                result = llogaritShuma(nr1, nr2);
                break;
            case '-':
                result = nr1 - nr2;
                break;
            case '*':
                result = nr1 * nr2;
                break;
            case '/':
                result = nr1 / nr2;
                break;
            default:
                System.out.println("Invalid"); //nese veprimi nuk perket me nje nga rastet atehere shkojme ketu
        }

        System.out.println("Resultati:" + result);

    }

    //metode qe llogarit shumen e dy numrave
    static float llogaritShuma(float nr1, float nr2) {
        return nr1 + nr2;
    }
}
