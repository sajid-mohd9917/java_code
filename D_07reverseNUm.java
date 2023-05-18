import java.util.Scanner;

public class D_07reverseNUm {
    int sum = 0;
public int reverseNum(int n) {

    if(n==0)
    {
        return 0;
    }
    int rem = n%10;
    sum = sum*10 +rem;

     reverseNum(n/10);
    return sum;
         
    
}


    public static void main(String[] args)
    {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the number :");
    int n = sc.nextInt();

    D_07reverseNUm rvn = new D_07reverseNUm();

    int R_num= rvn.reverseNum(n);

    System.out.println("reverse num is = "+R_num);

    if(n==R_num)
    {
        System.out.println("yes! num is palindrom");
    }
    else{
        System.out.println("no! num is not palindrom");
    }

    }
}