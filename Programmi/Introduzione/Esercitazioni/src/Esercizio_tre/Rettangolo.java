package Esercizio_tre;

public class Rettangolo extends Figura {

    private int base;
    private int altezza;

    public Rettangolo(int b, int h){
        super();
        base = b;
        altezza = h;
    }

    @Override
    public void CalcArea(){
        area = base*altezza;
    }
    @Override
    public void CalcPerimetro(){
        perimetro = 2*base + 2*altezza;
    }

    public int getBase(){return base;}
    public int getAltezza(){return altezza;}

    public void setBase(int b){base = b;}
    public void setAltezza(int h){altezza = h;}
}
