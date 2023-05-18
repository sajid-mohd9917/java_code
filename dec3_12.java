    
import java.util.Scanner;
//sum of natural number using recursion
public class dec3_12
{
    public static int findSum(int n)
{
    if(n==0)
    {
        return 0;
    }
    int sum =n+findSum( n-1 );
 
    // return n+findSum( n-1 );
    // System.out.println("n is = "+n);
    System.out.println(n+" is "+"sum is "+sum);

    return sum;
}

    public static  long NumberSum(long N, long sum) {
        //Write your code here
		if(N==0)
		{
            
            return 0;
		}
        

		sum=sum+N;
        
        NumberSum( N-1,  sum);
      
        //  System.out.println(sum);

        return sum;
		
    }


    public static void main(String[] args)
    {
    Scanner sc =new Scanner(System.in);

    System.out.println("sum is = "+findSum( 5));
    // System.out.println("sum is = "+NumberSum( 5,0));

    }
}