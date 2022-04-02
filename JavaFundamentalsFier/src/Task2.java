import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vendosni peshen: ");
        double pesha = sc.nextDouble();

        System.out.println("Vendosni gjatesine ne cm: ");
        int gjatesiaCM = sc.nextInt();

        //kthejme gjatesine nga cm ne meter
        double gjatesiaM = (double) gjatesiaCM/100;

        //llogarisim BMI me formulen pesha (kg) / gjatesia(m)^2
        double BMI = pesha/(gjatesiaM * gjatesiaM);

        //BMI2 llogaritet po njelloj, por ne kete rast kemi perdorur metoden pow() nga klasa Math.
        // pow=power (pra ngritje ne fuqi)
        double BMI2 = pesha/Math.pow(gjatesiaM, 2);

        System.out.println("Vlera e bmi: " + BMI2);

        //nese BMI < 18.5 ose BMI > 24.9 atehere printojme "pesha jo optimale"
        if(BMI2 < 18.5 || BMI2 > 24.9) {
            System.out.println("Pesha jo optimale");
        } else {
            System.out.println("Pesha optimale");
        }
    }
}
