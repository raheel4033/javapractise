public class marksheet {
    public static void main(String[] args)
    {
        Result rr = new Result();
        rr.disp();

    }



}
class Result extends Student implements sports
{
    int total = 0;
    @Override
    public void spmarks() {
        System.out.println("Sports Marks are:"+sp);
    }
    void disp()
    {
        getmarks(100,84);
        printmarks();
        total = m1+m2+sp;
        System.out.println("Total number of marks are:"+total);
    }
}
class Student
{
    int m1,m2;
    void getmarks(int x,int y)
    {
        m1=x;
        m2=y;
    }
    void printmarks()
    {
        System.out.println("First Subject:"+m1);
        System.out.println("Second Subject:"+m2);
    }

}
interface sports
{
    int sp = 6;
    void spmarks();
}