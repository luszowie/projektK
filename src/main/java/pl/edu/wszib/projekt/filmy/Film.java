package pl.edu.wszib.projekt.filmy;

import javax.persistence.*;

@Entity
@Table(name = "lista_filmow")

public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String tytul;
    private String gatunek;
    private String rezyser;
    private String rokProdukcji;

    public Film() {
    }

    public int getId() {
        return id;
    }



    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public String getRezyser() {
        return rezyser;
    }

    public void setRezyser(String rezyser) {
        this.rezyser = rezyser;
    }

    public String getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(String rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

   /* @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", tytul='" + tytul + '\'' +
                ", gatunek='" + gatunek + '\'' +
                ", rezyser='" + rezyser + '\'' +
                ", rokProdukcji='" + rokProdukcji + '\'' +
                '}';
    }*/
}
