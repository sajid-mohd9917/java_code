import java.util.Scanner;

public class A001_unit8waterBill
{
    public static void main(String[] args)
    {

    // Scanner sc =new Scanner(System.in);
    // System.out.println("enter t water:");

    // int tw = sc.nextInt();
    //     if(tw<=100)
    //     {
    //         System.out.println(tw*15);
    //     }
    //     else if(tw>100 && tw<=200)
    //     {
    //      int bill=1500+(tw-100)*14;
    //  System.out.println(bill);
    //     }
    //     else
    //     {
    //         int bill= 100*15+100*14+(tw-200)*12;
    //         System.out.println(bill);
    //     }


    Scanner sc = new Scanner(System.in);
    System.out.println("enter num");
    int n=sc.nextInt();
    int sum=0;
    int x=1;
    while(x<=n)
    {
      int psum =((x+1)*(x+1));
      sum=sum+psum;
      x++;
    }
    System.out.println(sum);



    }
}
