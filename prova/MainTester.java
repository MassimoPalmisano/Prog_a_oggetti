package prova;

public class MainTester {

    public static void main(String[] args) {
        // Crea un'istanza di Libro
    Libro libro1 = new Libro("George Orwell", "1984", 5);
    
    // Test prestito
    libro1.prestito("George Orwell", "1984");
    System.out.println("Dopo prestito: " + libro1.getTitolo() + " - " + libro1.getNum_disp() + " copie disponibili");
    
    // Test restituzione
    libro1.restituzione("George Orwell", "1984");
    System.out.println("Dopo restituzione: " + libro1.getTitolo() + " - " + libro1.getNum_disp() + " copie disponibili");
    
    // Test con libro diverso (non dovrebbe modificare)
    libro1.prestito("J.R.R. Tolkien", "Il Signore degli Anelli");
    System.out.println("Dopo prestito (libro diverso): " + libro1.getTitolo() + " - " + libro1.getNum_disp() + " copie disponibili");
    }
}
