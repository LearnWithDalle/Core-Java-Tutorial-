import java.io.*;
import java.util.Scanner;

public class fileRe {

    public static void main(String[] args) {
        // Let's Create a File Using Java

        /*
         * File fileCreate = new File("ok.txt");
         * try {
         * fileCreate.createNewFile();
         * } catch (IOException e) {
         * System.out.println("File Can't Created for some Reason\n Some Error Occerd");
         * e.printStackTrace();
         * }
         */

        // Let's Write in a File Using Java
        /*
         * 
         * try {
         * FileWriter writeFile = new FileWriter("ok.txt");
         * writeFile.write(
         * "Hello jii \n It's Dalle pajiii \n hello i am Dalle i Write a java Code for Fun i write Code for \n chod ke naa jana kyu ki incoming video main hum bahut project kareng"
         * );
         * writeFile.close();
         * 
         * } catch (IOException e) {
         * 
         * System.out.println("error Agaya");
         * e.printStackTrace();
         * }
         * 
         */

        // Let's Read the File Using JAVA LAng
        /*
         * try {
         * 
         * FileReader readFile = new FileReader("ok.txt");
         * // For input We use Scanner
         * Scanner sc = new Scanner(readFile);
         * while (sc.hasNextLine()) {
         * String ok = sc.nextLine();
         * System.out.println(ok);
         * }
         * 
         * } catch (IOException e) {
         * System.out.println("Nothing Inside");
         * e.printStackTrace();
         * }
         */

        // for Deleting a File
        File deleFile = new File("ok.txt");
        if (deleFile.delete()) 
            System.out.println("File " + deleFile.getName() + " Sucessessfully Deleted...! ");
         else 
            System.out.println("some error occerd");

    }
}