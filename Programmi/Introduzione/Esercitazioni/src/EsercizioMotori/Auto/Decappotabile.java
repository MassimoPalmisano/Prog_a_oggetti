package EsercizioMotori.Auto;

public interface Decappotabile {
        int codice = 1;
        int valore = 350;
        String descrizione = "Tetto apribile";


        default void tostring(){
            System.out.println("L'optional decappotabile vale " + valore + "€ e rende il " + descrizione + ". \n Il suo codice è " + codice);
        }
}
