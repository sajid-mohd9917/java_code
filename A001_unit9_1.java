
import java.util.Scanner;

public class A001_unit9_1 {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter num");
        // int n = sc.nextInt();
        // int sum = 0;
        // int x = 1;
        // while (x <= n) {
        //     int psum = ((x + 1) * (x + 1) - (3 * x + 1) + x);
        //     sum = sum + psum;
        //     x++;
        // }
        // System.out.println(sum);



        	//your code here
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long fact=1;
    long i=1;
    while(i<=n)
    {
      fact=fact*i;
      i++;
    }
    System.out.println(fact);

    }
}