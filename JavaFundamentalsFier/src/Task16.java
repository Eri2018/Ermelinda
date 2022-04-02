import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        System.out.println("Vendosni 10 numra: ");
        Scanner sc = new Scanner(System.in);
        int[] numrat = new int[10];
        for (int i = 0; i < 10; i++) {
            numrat[i] = sc.nextInt();
        }
        int n = getLongestSequence(numrat);
        System.out.println("Sekuenca me e gjate eshte: " + n);
    }

    //metode qe llogarit sekuencen me te gjate
    private static int getLongestSequence(int[] numrat) {
        int longest = 0; //variabli ku do ruhet gjatesia e sekuences me te gjate
        int temp = 0; //variabel i perkohshem per te mbajtur vleren e sekuences me te gjate
        for (int i = 0; i < numrat.length - 1; i++) {
            if (numrat[i] < numrat[i + 1]) { //kontrollon nese numri paraardhes eshte me i vogel se ai pasardhes
                longest++; //rritet me 1
            } else {
                //nese numri paraardhes eshte me i madh se ai pasardhes fillimisht ruajme vleren e longest ne temp
                // nese longest > 0
                if (longest > 0)
                    temp = longest;

                //me pas longest e barazojme perseri me 0 qe te filloje sakte numerimi per subsekuencen e radhes
                //qe mund te gjendet
                longest = 0;
            }
        }

        //ne perfundim te loop nese longest < temp i japim asaj vleren e temp
        if (longest < temp)
            longest = temp;

        //nese longest > 0 e rrisim vleren e saj me 1 per te gjetur gjithe numrin e elementeve qe perbejne subsekuencen
        if (longest > 0)
            longest += 1;

        return longest;
    }
}
