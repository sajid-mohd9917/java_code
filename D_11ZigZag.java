
import java.util.Scanner;

public class  D_11ZigZag {

    public static void zigzagNUM(int n)
{
    if(n==0)
    {
        return;
    }
    System.out.println("pre "+n);

    zigzagNUM(n-1);

    System.out.println("in "+n);

    zigzagNUM(n-1);

    System.out.println("post "+n);
}

    

    public static void main(String[] args)
    {
    Scanner sc =new Scanner(System.in);
    

    System.out.println("for printing the zig zag number : ");
    System.out.print("enter the number: ");
    int n  = sc.nextInt();

    zigzagNUM(n);


    }
}