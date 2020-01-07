public class superkeyword {
    public static void main(String[] args)
    {
        A a = new A();
        //memebar of A class is called
        a.memeber();
        
    }


}
/* super keyword is used when the class has a same name method or field so when inherited the super keyword helps in calling
* the field method or class of the same name */

class A extends B
{
    int no=16;

     void memeber()
    {
        int bign = (super.no =19);
        System.out.println("Hello member:"+no);
        System.out.println("Super Number is:"+bign);
        super.memebar();
    }

}
class B
{
    int no;
    void memebar()
    {
     System.out.println("Hello my name is Raheel!");
    }
}