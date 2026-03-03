package prova2;

public class ContoCorrente {

    private int cc;
    private int saldo;
    private int movimenti[];
    private int count;

    public ContoCorrente(int cc, int saldo, int count){
        setCC(cc);
        setSaldo(saldo);
        setMovimento();
        setCount(count);
    }


    public void setCC(int cc){
        if(cc < 0)
            System.out.println("Errore!");
        else
            this.cc = cc;
    }

    public void setSaldo(int saldo){
        this.saldo = saldo;
    }

    public void setCount(int count){
        if(count >= 0)
            this.count = count;
        else 
            System.out.println("Errore!");
    }
    public void setMovimento(){
        this.movimenti = new int[10];
    }

    public void newMovimento(int saldo, int count){
        this.movimenti[count] = saldo;
        setCount(this.count + 1);
    }

    public void prelievo(int prelievo){
        setSaldo(this.saldo - prelievo);
        newMovimento(prelievo, this.count);
    }

    public void versamento(int versamento){
        setSaldo(this.saldo + versamento);
        newMovimento(versamento, this.count);
    }

    public int getSaldo(){
        return this.saldo;
    }
    
    public void printMovimenti(){
        for (int i = 0; i < count; i++) {
            System.out.print(movimenti[i] + " ");
        }
    }
    
}
