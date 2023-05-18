import java.util.Scanner;


public class D_05fibonacci {
    
    public int fibonacci(int n) {

       if(n<2)
       {
        return n;
       }
         else {
            
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }

    public static void main(String[] args)
    {
    Scanner sc =new Scanner(System.in);
    System.out.print("ente rthe number : ");
    int n =sc.nextInt();


    D_05fibonacci  fb = new D_05fibonacci();

   int fibonacciNUM=fb.fibonacci(n);

    // System.out.println(fb.fibonacci(7));

    System.out.printf("%dth fibonacci number of  is =%d",n, fibonacciNUM);
    }
}