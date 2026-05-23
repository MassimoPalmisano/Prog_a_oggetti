package EsercizioQuattro;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiaFile {

    public static void main(String[] args){

        try(FileInputStream f = new FileInputStream(args[0]);
            FileOutputStream fout = new FileOutputStream(args[1])){
        
            System.out.println("Successo");

            f.transferTo(fout);

        } catch(IOException e){
            System.out.println("Errore nella copia");
        }
    }

}
