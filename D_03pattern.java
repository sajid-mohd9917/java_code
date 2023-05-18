
import java.util.Scanner;

public class D_03pattern {
    public void printAc(int n) {
        // System.out.println("a");
        if (n == 0) {

            return;
        }
        printAc(n - 1);

        System.out.print(n + " ");
    }

    public void printDc(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printDc(n - 1); // tail recursion
    }

    public void mergeB(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        mergeB(n-1);
        System.out.print(n + " ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter the number:");
        int n = sc.nextInt();

        D_03pattern p = new D_03pattern();

        // p.printAc(n); //for ascending order

        // p. printDc(n); //for descending order

        p.mergeB(n);
    }
}
