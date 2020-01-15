public class clas {
    public static void main(String[] args)
    {
    thiskeyword obj = new thiskeyword(6);
    obj.print();


    }

}
class thiskeyword {
    int x; //instance this keyword will help access keyword related to this

    thiskeyword(int x) { // local
        this.x = x;
    }

    public void print() {
        System.out.println("The num is:" + x);
    }
}
