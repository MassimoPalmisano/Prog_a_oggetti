package Esercizio_due;

public class Tester {
    public static void main(String[] args) {

        ContoCorrente[] ccs;
        ccs = new ContoCorrente[3];
        for (int i =0; i<3; i++){
            ccs[i] = new ContoCorrente(i);
        }
        ccs[1].Versamento(42);
        ccs[0].Versamento(79);
        ccs[0].Prelievo(34);
        ccs[2].Versamento(67);
        ccs[0].Prelievo(2);
        ccs[0].Prelievo(24);
        ccs[1].Prelievo(19);
        ccs[2].Versamento(110);
        ccs[2].Versamento(99);
        ccs[1].Prelievo(15);
        for (int i =0; i<3; i++){
            System.out.println("Movimenti di conto di " + i);
            ccs[i].getMovimenti();
            System.out.println("");
        }
    }
}
