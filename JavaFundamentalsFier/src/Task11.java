import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni nje fjale: ");
        String fjalaUser = sc.nextLine();
        String fjalaMax = "";

        //Do te perseritet per aq kohe sa fjala nuk eshte Enough!
        while (!fjalaUser.equals("Enough!")) {

            //kontrollojme nese fjala e vendosur eshte bosh
            while(fjalaUser.isBlank()) {
                System.out.println("No text provided");
                fjalaUser = sc.nextLine();
            }

            //nese gjatesia e fjales maksimale eshte me e vogel se gjatesia e fjales se perdoruesit
            if(fjalaMax.length() < fjalaUser.length()) {
                fjalaMax = fjalaUser; //fjala max behet fjala e vendosur nga perdoruesi
            }
            fjalaUser = sc.nextLine(); //marrim nje fjale tjeter nga perdoruesi
        }

        if(!fjalaMax.isBlank())
            System.out.println("Fjala me e gjate eshte: " + fjalaMax);
    }
}
