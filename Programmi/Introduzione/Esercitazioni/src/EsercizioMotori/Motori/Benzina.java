package EsercizioMotori.Motori;

public class Benzina extends Motore{

    public Benzina(int n, int m){
        super(n, m);
    }

    @Override 
    public void GetTipo(){
        System.out.println("Benzina");
    }

    @Override
    public int RPM(){
        CalcPotenza();
        return potenza * 400;
    }
}
