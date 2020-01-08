class packconcept {
    public static void main(String[] args)
    {
        myclass myc = new myclass();
        myc.run();
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