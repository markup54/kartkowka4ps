package pl.zabrze.zs10.kartkowka4ps;
public class Obraz {
    private int idObrazka;
    private int pobrania;

    public Obraz(int idObrazka) {
        this.idObrazka = idObrazka;
        pobrania = 0;
    }

    public int getIdObrazka() {
        return idObrazka;
    }



    public int getPobrania() {
        return pobrania;
    }

    public void setPobrania() {
        this.pobrania++;
    }

}
