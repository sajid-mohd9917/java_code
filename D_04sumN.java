
public class D_04sumN
{
   
    public int sumN(int n) {
        if(n==0)
        {
            return 0;
        }
        return n+sumN(n-1);

        
    }


    


/*
    public int sumSqN(int n) {
       
        if(n==0)
        {
            return 0;
        }
        return n*n+sumSqN(n-1);

    }
 */
    public static void main(String[] args)
    {
        int n = 3;
        D_04sumN sm= new D_04sumN();
        sm.sumN(n);
    System.out.print( "sum of n natural niumber is  ="+sm.sumN(n));

    // System.out.print("sum of square of n natural no is ="+ sm.sumSqN(n));
    }
}
