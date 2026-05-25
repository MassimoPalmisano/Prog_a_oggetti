public class SubC extends C{

    //Costruttore con 0 e con valore dato
    public SubC(){
        super();
    }

    public SubC(int n){
        super(n);
    }

    public void Sottrazione(int n){
        //Usiamo i metodi definiti per modificare il valore privato di C
        setValore(getValore() - n);
    }

    @Override
    public void Somma(int n){
        if(n<0){
            System.out.println("Errore: valore inserito minore di 0");
        }
        else{
            setValore(getValore() + n);
        }
    }
}
