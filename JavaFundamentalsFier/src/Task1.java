import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float pi = 3.14f;
        System.out.print("Vendos diametrin: ");
        float diameter = scanner.nextFloat();
        System.out.println("Perimetri 1: " + pi * diameter); //llogaritje me variabel e deklaruar nga ne
        System.out.println("Perimetri 2: " + Math.PI * diameter); //llogaritje me variablen PI te marre nga klasa Math
    }
}
