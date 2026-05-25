public class C {

    private int ValoreMem;

    //Costruttore per valore 0
    public C(){
        ValoreMem = 0;
    }

    //Costruttore per valore dato
    public C(int n){
        ValoreMem = n;
    }

    //Metodo di lettura valore
    public int getValore(){
        return ValoreMem;
    }

    //Metodo di modifica valore
    public void setValore(int n){
        ValoreMem = n;
    }

    //Metodo di addizione del valore con valore dato
    public void Somma(int n){
        ValoreMem = ValoreMem + n;
    }
}
