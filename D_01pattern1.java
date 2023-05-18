import java.util.Scanner;

public class D_01pattern1 {

    public void printS(int n) {

        if(n==0)
        {
            return;
        }
        int i=0;
        while(i<n)
        {
        System.out.printf("*");
            i++;
        }
        System.out.println("");

        printS(n-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("enter the number :");
        int n = sc.nextInt();

        D_01pattern1 sa = new D_01pattern1();
        sa.printS(n);

        System.out.println();
    }
}
