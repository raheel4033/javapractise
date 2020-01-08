import java.sql.SQLOutput;

public class threadasobject {
    public static void main(String[] args) {
        test t = new test();
        Thread obj = new Thread(t);
        obj.start();
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Main Thread!");
        }
    }

}


class test implements Runnable
{
    public void run() {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Here is the thread");
        }
    }
}
