package Esercizio_tre;

public class Cerchio extends Figura{

    private int raggio;
 
    public Cerchio(int r){
        super();
        raggio = r;
    }

    @Override
    public void CalcArea(){
        area = (int) Math.PI * (raggio*raggio);
    }
    @Override
    public void CalcPerimetro(){
        perimetro = (int) Math.PI*2*raggio;
    }

    public int getRaggio(){return raggio;}
    
    public void setRaggio(int r){raggio = r;}
}
