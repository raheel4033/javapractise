import java.util.Scanner;


public class bank {
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
        System.out.print("Enter the amount value:");
    float amount = scan.nextFloat();
        System.out.println();
        System.out.print("Enter the amount of interest:");
    float interest = scan.nextFloat();
    Calculation clc = new Calculation(amount,interest);
    clc.total();
    clc.print();
    }
}
class Calculation
{
    float amount;
    float interest;
    float total;
    public Calculation(float amount,float interest)
    {
        this.amount = amount;
        this.interest = interest;
    }

    public float total()
    {
        total = amount * interest;
        return total;
    }
    public void print()
    {
        System.out.println("Total value is:"+total);
    }

}