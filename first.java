import java.util.ArrayList;

public class first {
    public static void main(String[] args)
    {
        ArrayList<Integer> item = new ArrayList<Integer>();
        item.add(1);
        item.add(14);
        item.add(12);

        printArray(item);

    }
    public static void printArray(ArrayList<Integer> n)
    {
        for(int i :n ) {
            System.out.println(i*2);
        }
    }
}
