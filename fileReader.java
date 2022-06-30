package Day09.FileParser;

import java.io.FileReader;
import java.io.IOException;
 
public class fileReader {
 
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("Day09.txt");
            int character;
 
            while ((character = reader.read()) != -1) {
                System.out.println("Reading from: " + new java.io.File("Day09.txt").getAbsolutePath());
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();

            


        }
    }
 
}