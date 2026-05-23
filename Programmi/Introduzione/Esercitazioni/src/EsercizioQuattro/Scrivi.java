package EsercizioQuattro;

import java.io.*;

public class Scrivi {

    public static void main(String[] args) {
        
        try{
        DataOutputStream out = new DataOutputStream(new FileOutputStream(args[0]));
        BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));


        int[] dati = new int[5];

        System.out.println("Inserire i numeri da scrivere sul file:");
        for(int i = 0; i< 5; i++){
            dati[i] = Integer.parseInt(sin.readLine());
        }

        for(int i = 0; i< 5; i++){
            out.writeInt(dati[i]);
        }

        out.close();

        }catch(FileNotFoundException e){
            System.err.println("Errore");
        }
        catch(IOException e){
            System.err.println("Errore");
        }
    }
}