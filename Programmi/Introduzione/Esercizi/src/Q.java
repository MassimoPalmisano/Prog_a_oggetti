public class Q extends R {

    public Q(){
        super();
    }

    public Q(int l){
        //il check di positività del valore dato viene eseguito nel costruttore di R
        super(l,l);
    }

    @Override
    public void setValori(int b, int h){
        if(b == h){
            super.setValori(b, h);
        }
        else{
            System.out.println("Errore: i valori inseriti sono diversi");
        }
    }
}
