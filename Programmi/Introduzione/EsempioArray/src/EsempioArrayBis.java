import Pacchetto.*;

public class EsempioArrayBis {
    public static void main(String args[]){
        Contatore v[]; // riferimento al futuro vettore
        v = new Contatore[3];
        // creazione vettore di tre (riferimenti a) Contatore
        // NB: gli oggetti Contatore però ancora non esistono!

        v[0] = new Contatore(0); // partiamo dall’inizio
        v[1] = new Contatore(100); // abbiamo già 100!
        // v[2] contiene null
}
}

