package EsercizioMotori.Motori;

public abstract class Motore {
     
    protected int cilindrata;
    protected int cilindri;
    protected int potenza;
    
    public Motore(int n, int m){
        cilindrata = n;
        cilindri = m;
        potenza = 0;
    }

    public int getCilindrata(){return cilindrata;}
    public void CalcPotenza(){potenza = cilindrata * cilindri;}
    public int getPotenza(){return potenza;}

    public abstract void GetTipo();
    public abstract int RPM();
}
