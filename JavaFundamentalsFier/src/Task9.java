import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int lartesia = 4;
        System.out.println("Vendosni gjeresine: ");
        Scanner sc = new Scanner(System.in);
        int gjeresia = sc.nextInt();
        for (int i = 0; i < lartesia; i++) {
            String lineStr = prepareLine(i, lartesia, gjeresia);
            System.out.println(lineStr);
        }
    }

    //printimi i yjeve behet rresht me rresht sipas gjeresise
    //pra nese gjeresia eshte 2 do te printohet fillimisht rreshti i pare
    // *      **      * -> rreshti 1
    //  *    *  *    * -> rreshti 2
    //   *  *    *  *  -> rreshti 3
    //    **      **   -> rreshti 4
    private static String prepareLine(int line, int lartesia, int gjeresia) {
        String lineStr = "";
        for (int j = 1; j <= gjeresia; j++) {
            //ben te mundur printimin e hapesirave ne fillim
            int beforeSpaces = line;
            if (j > 1) {
                beforeSpaces *= 2;
            }
            for (int k = beforeSpaces; k > 0; k--) {
                lineStr += " ";
            }

            //printon yllin pas hapesirave fillestare
            lineStr += "*";

            //printon hapesiren mes dy yjeve
            int length = lartesia + lartesia - 2;
            int spaces = length - (2 * line); // llogarit spaces midis dy yjeve ne nje V
            for (int l = spaces; l > 0; l--) {
                lineStr += " ";
            }
            //printon yllin pas hapesirave te mesit
            lineStr += "*";
        }
        return lineStr;
    }
}