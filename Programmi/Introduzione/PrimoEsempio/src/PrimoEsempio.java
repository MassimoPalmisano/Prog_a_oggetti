public class PrimoEsempio {
public static void main(String args[]){

    for(int i=0; i<args.length; i++){
    System.out.println("arg" + (i+1) + ": " + args[i]); 
}

    // dichiariamo una variabile di tipo Contatore
    Contatore c;

    // creiamo un oggetto e lo assegniamo a c
    c = new Contatore();

    // chiamiamo delle operazioni su c
    c.setVal(0);
    c.inc();

    // stampiamo un messaggio
    System.out.print("Valore: ");
    System.out.println(c.getVal());
    System.out.println("Ciao Mondo!");
}
}