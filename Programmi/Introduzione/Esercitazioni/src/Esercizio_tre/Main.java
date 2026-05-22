package Esercizio_tre;

public class Main {
    public static void main(String[] args) {

        // TRIANGOLO GENERICO
        Figura triangolo = new Triangolo(8, 5, 7, 6);
        System.out.println("TRIANGOLO:");
        triangolo.CalcArea();
        triangolo.CalcPerimetro();
        triangolo.Stampa();
        System.out.println();

        // TRIANGOLO RETTANGOLO
        Figura triangoloRettangolo = new Triangolo_Rettangolo(5, 12, 13);
        System.out.println("TRIANGOLO RETTANGOLO:");
        triangoloRettangolo.CalcArea();
        triangoloRettangolo.CalcPerimetro();
        triangoloRettangolo.Stampa();
        System.out.println();

        // RETTANGOLO
        Figura rettangolo = new Rettangolo(10, 5);
        System.out.println("RETTANGOLO:");
        rettangolo.CalcArea();
        rettangolo.CalcPerimetro();
        rettangolo.Stampa();
        System.out.println();

        // QUADRATO
        Figura quadrato = new Quadrato(6);
        System.out.println("QUADRATO:");
        quadrato.CalcArea();
        quadrato.CalcPerimetro();
        quadrato.Stampa();
        System.out.println();

        // CERCHIO
        Figura cerchio = new Cerchio(3);
        System.out.println("CERCHIO:");
        cerchio.CalcArea();
        cerchio.CalcPerimetro();
        cerchio.Stampa();
        System.out.println();

        // TEST POLIMORFISMO CON ARRAY
        System.out.println("ARRAY DI FIGURE (POLIMORFISMO):");
        Figura[] figure = new Figura[5];

        figure[0] = triangolo;
        figure[1] = triangoloRettangolo;
        figure[2] = rettangolo;
        figure[3] = quadrato;
        figure[4] = cerchio;

        for (Figura f : figure) {
            f.Stampa();
            System.out.println();
        }
    }
}
