class packconcept {
    public static void main(String[] args)
    {
        myclass myc = new myclass();
        myclass2 myc2 = new myclass2();
        myc.start();
        myc2.start();
    }

}
class myclass extends Thread implements Runnable
{
    public void run() {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Starting from Thread:"+i);
        }
        System.out.println("Exiting from Thread");
    }
}
class myclass2 extends Thread implements Runnable
{
    public void run() {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Starting from Thread 2:"+i);
        }
        System.out.println("Exiting from Thread 2");
    }
}