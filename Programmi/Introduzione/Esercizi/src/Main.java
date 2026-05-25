public class Main {

    public static void main(String[] args){

        /** 
        Esercizio 1

        
        C Calcolatrice = new C(10);
        SubC CalcSub = new SubC();

        
        System.out.println("Classe C");

        System.out.println("Il valore nella calcolatrice prima di sommare 5 è " + Calcolatrice.getValore());

        Calcolatrice.Somma(5);

        System.out.println("Il valore dopo la somma è " + Calcolatrice.getValore());


        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Classe SubC");

        System.out.println("Insriamo il valore 20 nella Calcolatrice");

        CalcSub.setValore(20);

        System.out.println("Sottraiamo 7");

        CalcSub.Sottrazione(7);

        System.out.println("Il suo valore ora è " + CalcSub.getValore());

        System.out.println("Se proviamo a Sommare -4 ci darà errore: ");

        /**Chiamando CalcSub.Somma otteniamo un comportamento Polimorfico dato che il
        risultato della chiamata di questo metodo sarebbe stata diversa se fosse stata chiamata
        tramite la classe padre C
        CalcSub.Somma(-4);

        */

    }
}
