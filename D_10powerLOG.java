import java.util.Scanner;

public class  D_10powerLOG {

    public static int powerLog(int x, int n)
{
    if(n==0)
    {
        return 1;
    }
    int x1=powerLog(x,n/2);
    int x2= x1*x1;
    if(n%2==1)
    {
        x2=x2*x;

    }
return x2;
}

    

    public static void main(String[] args)
    {
    Scanner sc =new Scanner(System.in);
    
    System.out.println("enter the base :");
    int x  = sc.nextInt();

    System.out.println("enter the power ");
    int n  = sc.nextInt();

    int ans = powerLog(x,n);

    System.out.printf("%d to the power %d is = %d",x,n,ans);
    }
}