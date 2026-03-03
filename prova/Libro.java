package prova;

/**
 * Rappresentazione di un libro con autore, titolo e numero di copie disponibili in un database
 * Permette operazioni di prestito e di ritorno
 */
public class Libro {

    //Definizione variabili private

    /**Nome dell'autore del libro */
    private String autore;

    /**Titolo del libro */
    private String titolo;

    /**Numero di copie disponibili per il prestito */
    private int num_disp;


    //Costruttore

    /**Crea un nuovo libro
     * 
     * @param autore autore del libro
     * @param titolo titolo del libro
     * @param num_disp copie disponibili per il prestito
     */
    public Libro(String aut, String tit, int num){
        this.autore = aut;
        this.titolo = tit;
        this.num_disp = num;
    }

    //Metodi richiesti

    /**Esegue un prestito di un libro
     * 
     * @param autore usato per il controllo del libro
     * @param titolo usato per il controllo del libro
     * @param num_disp viene decrementato se il libro viene dato in prestito
     */
    public void prestito(String aut, String tit){
        if(this.autore.equals(aut) && this.titolo.equals(tit) && this.num_disp > 0)
            this.num_disp = this.num_disp - 1;
    }


    /**Esegue il ritorno di un libro
     * 
     * @param autore usato per il controllo del libro
     * @param titolo usato per il controllo del libro
     * @param num_disp viene incrementato se il libro viene restituito
     */
    public void restituzione(String aut, String tit){
        if(this.autore.equals(aut) && this.titolo.equals(tit))
            this.num_disp = this.num_disp + 1;
    }


    /**Ritornano i valori degli attributi */
    public String getAutore() {
    return this.autore;
    }

    public String getTitolo() {
        return this.titolo;
    }

    public int getNum_disp() {
        return this.num_disp;
}
}
