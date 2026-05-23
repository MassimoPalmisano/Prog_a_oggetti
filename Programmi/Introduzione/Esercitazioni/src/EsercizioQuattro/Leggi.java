package EsercizioQuattro;

import java.io.*;

public class Leggi {


        public static void main(String[] args) {
        
        try{
        DataInputStream in = new DataInputStream(new FileInputStream(args[0]));


        int[] dati = new int[5];

        for(int i = 0; i< 5; i++){
            System.out.print(in.readInt() + " ");
        }

        in.close();

        }catch(FileNotFoundException e){
            System.err.println("Errore");
        }
        catch(IOException e){
            System.err.println("Errore");
        }
    }
}
