import java.util.Scanner;

class packagewali
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number!");
        Scanner ss = new Scanner(System.in);
        int num =ss.nextInt();
        if(num%5==0 && num%3==0)
        {
            System.out.println("FizzBuzz");
        }
        else if(num%5==0)
        {
            System.out.println("Fizz");
        }
        else if(num%3==0)
        {
            System.out.println("Buzz");
        }

        else
        {
            System.out.println(num);
        }

    }
}