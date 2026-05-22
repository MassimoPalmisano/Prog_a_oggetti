package Pacchetto;

public class Contatore {

    // stato composto da variabili
    private int val;

    // interfaccia composta da metodi
    public Contatore() {val = 0;}

    public void setVal(int newVal) {val = newVal;}

    public void inc() {val++;}
    
    public int getVal() {return val;}
}
