package Esercizio_due;

public class Contatore {

    // stato composto da variabili
    private int val;

    // interfaccia composta da metodi
    public Contatore() {val = 0;}

    public Contatore(int n) {val = n;}

    public void setVal(int newVal) {val = newVal;}

    public void inc() {val++;}

    public void dec() {val--;}
    
    public int getVal() {return val;}
}
