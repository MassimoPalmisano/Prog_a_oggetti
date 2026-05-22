package Esercizio_tre;

public class Triangolo_Rettangolo extends Figura {

    private int base;
    private int altezza;
    private int lato;

    public Triangolo_Rettangolo(int b, int h, int l){
        super();
        base = b;
        altezza = h;
        lato = l;
    }

    @Override
    public void CalcArea(){
        area =(base*altezza)/2;
    }
    @Override
    public void CalcPerimetro(){
        perimetro = lato + altezza + base;
    }

    public int getBase(){return base;}
    public int getAltezza(){return altezza;}
    public int getLato(){return lato;}

    public void setBase(int b){base = b;}
    public void setAltezza(int h){altezza = h;}
    public void setLato(int l){lato = l;}
}
