
public class D_04
{

    public void print(int n) {
        if(n>10)
        {
            return;
        }
        print(n+1);
        System.out.println(n);


        // System.out.println(n);
        // print(n+1);
    }
    public static void main(String[] args)
    {
        D_04 p = new D_04();

        p.print(1);       // for printing 1 to 10 number
        
      
    }
}