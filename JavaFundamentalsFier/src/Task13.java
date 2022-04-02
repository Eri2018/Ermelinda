import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        System.out.println("Give the text");
        String str = sk.nextLine();
        String str2 = sk.nextLine();

        afisho(str);
        System.out.println();
        afisho(str2);

        afishoMeRepeat(str);
        System.out.println();
        afishoMeRepeat(str2);
        sk.close();
    }

    static void afishoMeRepeat(String str){
        //split() -> ndan stringun ne stringje me te vegjel ne baze te kushtit te vendosur brenda kllapave
        //ketu split(" ") -> ndan ne baze te hapesirave boshe
        String[] array = str.split(" ");
        String p = "";
        for(String s: array){
            p += (s + " ").repeat(2); //repeat(2) -> perserit stringun 2 here
        }
        System.out.println(p);
    }

    static void afisho(String stringUser){
        String[] array = stringUser.split(" ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " " + array[i] + " ");
        }
    }
}
