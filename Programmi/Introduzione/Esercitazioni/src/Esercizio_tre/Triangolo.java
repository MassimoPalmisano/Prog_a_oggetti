package Esercizio_tre;

public class Triangolo extends Figura{

    private int base;
    private int altezza;
    private int lato1;
    private int lato2;

    public Triangolo(int b, int h, int l1, int l2){
        super();
        base = b;
        altezza = h;
        lato1 = l1;
        lato2 = l2;
    }

    @Override
    public void CalcArea(){
        area =(base*altezza)/2;
    }
    @Override
    public void CalcPerimetro(){
        perimetro = lato1 + lato2 + base;
    }

    public int getBase(){return base;}
    public int getAltezza(){return altezza;}
    public int getLato1(){return lato1;}
    public int getLato2(){return lato2;}

    public void setBase(int b){base = b;}
    public void setAltezza(int h){altezza = h;}
    public void setLato1(int l1){lato1 = l1;}
    public void setLato2(int l2){lato2 = l2;}

}
