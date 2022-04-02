package Task19;

/*
* Klasa autor me fushat mbiemer, nacionalitet
* Kemi dy konstruktore 1 bosh, 1 me 2 parametra
* Kemi deklaruar metodat Get dhe Set per secilen variabel private
* */
public class Author {
    private String surname;
    private String nationality;

    public Author(){ /* konstruktor bosh */}

    public Author(String surname, String nationality) {
        this.surname = surname;
        this.nationality = nationality;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
