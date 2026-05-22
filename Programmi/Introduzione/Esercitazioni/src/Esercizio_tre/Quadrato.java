package Esercizio_tre;

public class Quadrato extends Figura {

    private int lato;

    public Quadrato(int l){
        super();
        lato = l;
    }

    @Override
    public void CalcArea(){
        area = lato * lato;
    }
    @Override
    public void CalcPerimetro(){
        perimetro = 4*lato;
    }

    public int getLato(){return lato;}

    public void setLato(int l){lato = l;}
}
