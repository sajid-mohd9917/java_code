import java.util.Scanner;

public class D_08power {

    public static int power(int x, int n)
{
    if(n==0)
    {
        return 1;
    }
    int x1=power(x, n-1);
    int y= x1*x;
    return y;
}

    

    public static void main(String[] args)
    {
    Scanner sc =new Scanner(System.in);
    
    System.out.println("enter the base :");
    int x  = sc.nextInt();

    System.out.println("enter the power ");
    int n  = sc.nextInt();

    int ans = power(x,n);

    System.out.printf("%d to the power %d is = %d",x,n,ans);
    }
}