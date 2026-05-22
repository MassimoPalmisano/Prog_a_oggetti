package Esercizio_uno;

public class Biblioteca {

    public static void main(String[] args) {
        Libro l1;
        Libro l2;
        Libro l3;

        l1 = new Libro("Suzanne Collins", "Hunger Games", 15);
        l2 = new Libro("George R R Martin", "A Game of Thrones", 10);
        l3 = new Libro("Paru Itagaki",  "Beastars vol.1", 6);

        System.out.println(l1.getTitolo() + "\t" + l1.getNum() + " Copie Disponibili");
        l1.Prestito();
        System.out.println(l1.getTitolo() + "\t" + l1.getNum() + " Copie Disponibili");

        System.out.println(l1.getTitolo() + "\t" + l1.getNum() + " Copie Disponibili");
        l1.Prestito();
        System.out.println(l1.getTitolo() + "\t" + l1.getNum() + " Copie Disponibili");

        System.out.println(l1.getTitolo() + "\t" + l1.getNum() + " Copie Disponibili");
        l1.Restituzione();
        System.out.println(l1.getTitolo() + "\t" + l1.getNum() + " Copie Disponibili");

        System.out.println(l3.getTitolo() + "\t" + l3.getNum() + " Copie Disponibili");
        l3.Prestito();
        System.out.println(l3.getTitolo() + "\t" + l3.getNum() + " Copie Disponibili");

        System.out.println(l2.getTitolo() + "\t" + l2.getNum() + " Copie Disponibili");
        l2.Prestito();
        System.out.println(l2.getTitolo() + "\t" + l2.getNum() + " Copie Disponibili");
    }
}
