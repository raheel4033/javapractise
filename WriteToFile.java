
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter mywriter = new FileWriter("D:filef1.txt");
            mywriter.write("Hello world in the java file");
            mywriter.close();
            System.out.println("Successfully stored to the file");

        }
        catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
        finally {
            System.out.println();
        }
    }
}
