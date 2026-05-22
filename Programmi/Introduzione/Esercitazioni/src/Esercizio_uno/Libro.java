package Esercizio_uno;

public class Libro {

    private String Autore;
    private String Titolo;
    private Contatore num;

    public Libro(String Autore, String Titolo, int num){
        this.Autore = Autore;
        this.Titolo = Titolo;
        this.num = new Contatore(num);
    }

    public void Prestito(){ num.dec();}
    public void Restituzione(){num.inc();}

    public String getAutore(){return Autore;}
    public String getTitolo(){return Titolo;}
    public int getNum(){return num.getVal();}
}
