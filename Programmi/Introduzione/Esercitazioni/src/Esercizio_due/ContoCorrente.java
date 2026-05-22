package Esercizio_due;

public class ContoCorrente {

    private int numero;
    private int saldo;
    private int[] movimenti;
    private Contatore MovCount;

    public ContoCorrente(int num){
        numero = num;
        saldo = 0;
        movimenti = new int[100];
        MovCount = new Contatore();
    }

    public void Versamento(int Importo){
        //cambiamo il valore del saldo
        saldo = saldo + Importo;

        //Inserieamo l'importo prelevato nell'array dei movimenti
        movimenti[MovCount.getVal()] = Importo;
        MovCount.inc(); //Incrementiamo il contatore
    }

    public void Prelievo(int Importo){
        //Rendiamo l'importo negativo così da poter salvare in negativo il valore nell'array
        Importo = - Importo;

        //Chiamando Versamento con l'importo negativo possiamo usare lo stesso principio
        Versamento(Importo);
    }

    public int getSaldo(){return saldo;}
    
    public void getMovimenti(){
        for(int i = 0; i< MovCount.getVal(); i++){
            System.out.print(movimenti[i] + "\t");
        }
    }

}
