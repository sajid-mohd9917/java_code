import java.util.Scanner;

public class D_02pattern {
    
    public void printP(int n) {
        // System.out.println("a");
        if (n == 0) {

            return;
        }
        printP(n - 1);
       int i = 0;
        while(i<n){
        System.out.printf("*");
        i++;
        }
        System.out.println( "");
    }

    public void printB(int n) {
        // System.out.println("a");
        if (n == 0) {

            return;
        }

        int j = 0;
        while(j<n){
        System.out.printf("* ");
        j++;
        }
        System.out.println( "");

        printB(n - 1);
       int i = 0;
        while(i<n){
        System.out.printf("* ");
        i++;
        }
        System.out.println( "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter the number:");
        int n = sc.nextInt();

        D_02pattern p = new D_02pattern();
        // p.printP(n);
         p.printB(n);

        System.out.println();
    }
}
