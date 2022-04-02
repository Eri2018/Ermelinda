package Task19;

/*
 * Klasa Poem me fushat krijuesi (i tipit autor), nr i strofave
 * Kemi dy konstruktore 1 bosh, 1 me 2 parametra
 * Kemi deklaruar metodat Get dhe Set per secilen variabel private
 * */
public class Poem {
    private Author creator;
    private int stropheNo;

    public Poem() { /* Konstruktor bosh*/ }
    public Poem(Author creator, int stropheNo) {
        this.creator = creator;
        this.stropheNo = stropheNo;
    }

    public Author getCreator() {
        return creator;
    }

    public void setCreator(Author creator) {
        this.creator = creator;
    }

    public int getStropheNo() {
        return stropheNo;
    }

    public void setStropheNo(int stropheNo) {
        this.stropheNo = stropheNo;
    }
}
