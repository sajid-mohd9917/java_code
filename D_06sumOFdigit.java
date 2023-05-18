import java.util.Scanner;

public class D_06sumOFdigit {

    // public int sumofDigit(int n)
    // {
    // if(n==0)
    // {
    // return 0;
    // }
    // else{
    // return (n%10)+sumofDigit(n/10);
    // }
    // }


    int sum =0;
    public int sumofDigit(int n)
    {
    if(n==0)
    {
    return 0;
    }
    sum = sum+(n%10);

    sumofDigit(n/10);
    return sum;
    
    }


    // public int productofDigit(int n) {
    //     if (n == 0)
    //  {
    //         return 1;
    //     } else {
    //         return (n % 10) * productofDigit(n / 10);
    //     }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number :");
        int n = sc.nextInt();

        D_06sumOFdigit sm = new D_06sumOFdigit();
        int sum_d= sm.sumofDigit(n);
        System.out.println(sum_d);

        // int pro_d = sm.productofDigit(n);
        // System.out.println("product of digit is = " + pro_d);
    }
}