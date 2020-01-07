public class interfac {
        public static void main(String[] args)
        {
            same s = new same();
            s.na();
            s.nna();
            s.nnna();
        }


}
class same implements name
{
    @Override
    public void na() {
    System.out.println("Hello na");
    }

    @Override
    public void nna() {
    System.out.println("Hello nna");
    }

    @Override
    public void nnna() {
    System.out.println("Hello nnna");
    }
}
interface name extends name1,name2
{
    void na();
}
interface name1
{
    void nna();
}
interface name2
{
    void nnna();

}