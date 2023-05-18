import java.util.Scanner;

public class A001_unit9_3
{ 
    public static long nthTerm(long n)
    {
        int a=0,b=1,c;
        if(n==0 || n==1)
        {
            return n;
        }
        for(int i=2;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;

        }
        return b;
    }

    public static void main(String[] args)
    {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter num:");
    long n = sc.nextLong();

// long nt=nthTerm(n);
// System.out.println(nt);


int a=0;
int b=1;
int c;
System.out.print(a+" "+b+" ");
for(int i=2;i<=n;i++)
{
    c=a+b;
    System.out.print(c+" ");
    a=b;
    b=c;
}

// if(nt<10)
// {
//     long rem=nt%10;
//     System.out.println("0"+rem);
// }
// else
// {
//     long rem = nt%100;
//     System.out.println(rem);
// }


    }
}