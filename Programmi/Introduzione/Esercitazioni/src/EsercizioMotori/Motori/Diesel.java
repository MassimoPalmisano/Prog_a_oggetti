package EsercizioMotori.Motori;

public class Diesel extends Motore{

    public Diesel(int n, int m){
        super(n, m);
    }

    @Override 
    public void GetTipo(){
        System.out.println("Diesel");
    }

    @Override
    public int RPM(){
        CalcPotenza();
        return potenza * 200;
    }
}
