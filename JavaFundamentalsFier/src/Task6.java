import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int num;
        double shumaVargu= 0.0;
        System.out.print("Vendos nje numer: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        shumaVargu = llogaritShumaVargu(num);
        System.out.println("Shuma eshte: "+ shumaVargu);
    }

    public static double llogaritShumaVargu(int nrPerdoruesi) {
        double shuma = 0.0;
        while (nrPerdoruesi > 0){
            shuma = shuma + (double) 1/nrPerdoruesi;
            nrPerdoruesi--;
        }
        return shuma;
    }
}
