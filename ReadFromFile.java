
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class ReadFromFile {
    public static void main(String[] args)
    {
        try {
            File ff =new File("D:filef1.txt");
            Scanner obj = new Scanner(ff);
            while (obj.hasNextLine())
            {
                String data = obj.nextLine();
                System.out.println(data);
            }
            obj.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An error occured");
            e.printStackTrace();
        }

    }


}
