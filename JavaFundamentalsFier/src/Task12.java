import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni nje fjali: ");
        String fjalia = sc.nextLine();
        int counter = 0;
        //iterojme nga 0 deri ne i < gjatesia e fjales
        for(int i = 0; i < fjalia.length(); i++) {

            //kontrollojme nese karaketri ne indeksin i eshte karakter 'space'
            if(Character.isSpaceChar(fjalia.charAt(i))) {
                counter++;
            }
        }
        System.out.println("Numri i spaces: " + counter);
        System.out.println("Perqindja e karaktereve space eshte: " +
                ((double)counter/fjalia.length()) * 100);
    }
}
