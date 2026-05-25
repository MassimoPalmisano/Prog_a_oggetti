public class R {

    private int Base;
    private int Altezza;

    public R(){
        Base = 0;
        Altezza = 0;
    }

    public R(int b, int h){
        if(b>= 0 && h >= 0){
            Base = b;
            Altezza = h;
        }
        else{
            System.out.println("Uno o entrambi i valori inseriti sono minori di 0");
        }
    }

    public void setValori(int b, int h){
        if(b>= 0 && h >= 0){
            Base = b;
            Altezza = h;
        }
        else{
            System.out.println("Uno o entrambi i valori inseriti sono minori di 0");
        }
    }

    public int Perimetro(){
        return 2*Base + 2*Altezza;
    }
}
