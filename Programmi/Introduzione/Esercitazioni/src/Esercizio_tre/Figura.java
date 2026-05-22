package Esercizio_tre;


public class Figura {
    
    protected int area;
    protected int perimetro;

    public Figura(){
        area = 0;
        perimetro = 0;
    }

    public void CalcArea(){area = 0;}
    public void CalcPerimetro(){perimetro = 0;}
    public void Stampa(){
        System.out.println("L'area è " + area + " e il perimetro " + perimetro);
    }
}

