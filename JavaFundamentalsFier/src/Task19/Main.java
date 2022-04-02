package Task19;

public class Main {
    public static void main(String[] args) {
        //krijojme objektin authorKadare te tipit Author
        Author authorKadare = new Author("Kadare", "Shqiptar");

        //krijojme objektin poem1 te tipit Poem me autor -> authorKadare dhe nr strofash -> 27
        Poem poem1 = new Poem(authorKadare, 27);

        Author agolli = new Author("Agolli", "Shqiptar");
        Poem poem2 = new Poem(agolli, 45);

        Poem poem3 = new Poem(new Author("Poradeci", "Shqiptar"), 34);

        //deklarojme nje array me size = 3 te tipit Poem
        //ruajme secilen poem brenda array-t poemat
        Poem[] poemat = new Poem[3];
        poemat[0] = poem1;
        poemat[1] = poem2;
        poemat[2] = poem3;

        String mbiemri = gjejAutorin(poemat);
        System.out.println(mbiemri);
    }

    //Metoda e cila kthen nje String dhe si parameter pranon nje array te tipit Poem
    private static String gjejAutorin(Poem[] poemat) {
        //si fillim longestPoem merr nr e strofave te poemes se pare (pra index 0)
        int longestPoem = poemat[0].getStropheNo(); //27

        //deklarojme nje variabel String e cila do mbaje vleren e mbiemrit
        String mbiemri = "";

        //deklarojme nje variabel index ku do ruajme indeksin e poemes me te gjate
        int index = 0;

        //iterojme array-n poemat
        for(int i = 1; i < poemat.length; i++) {
            //nese vlera e longestPoem eshte me e vogel se nr i strofave te poemes se radhes
            if(longestPoem < poemat[i].getStropheNo()) {
                longestPoem = poemat[i].getStropheNo(); //longestPoem do marre vleren e nr te strofave te poemes
                index = i; //ruajme indeksin e poemes me nr e strofave me te madhe
            }
        }
        //marrim nga array poemat, poemen me indeksin e gjetur me siper dhe me pas nga kjo poeme marrim Creator.
        //getCreator() na kthen Autorin dhe nga autori marrim mbiemrin me ane te getSurname()
        mbiemri = poemat[index].getCreator().getSurname();
        return mbiemri; //kthejme mbiemrin e gjetur
    }
}
