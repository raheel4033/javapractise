import java.io.File;



public class CreateFile {
    public static void main(String[] args)
    {
        File myObj = new File("D:filef1.txt" );
        if (myObj.exists())
        {
            System.out.println("File Name:"+myObj.getName());
            System.out.println("Absolute path:"+myObj.getAbsolutePath());
            System.out.println("Writeable:"+myObj.canWrite());
            System.out.println("Readable:"+myObj.canRead());
            System.out.println("File size in bytes:"+myObj.length());
        }
        else
        {
            System.out.println("File doesnot exist");
        }
    }

}
