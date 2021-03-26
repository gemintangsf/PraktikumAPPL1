package copyingafile;
/**
 *
 * @author GemintangSangkajiFurqon
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CopyingAFile {
    public static void main(String[] args) {
        try {
            //myObj untuk menyimpan data dari teks.txt
            File myObj = new File("teks.txt");
            
            //untuk mengambil data dan menampilkannya pada output
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } 
        catch(FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}