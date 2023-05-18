import java.util.Scanner;

public class D_14Nqueen
{
    public static void printNQueen(int [][]chess,String qsf,int row)
    {
        if(row==chess.length)
        {
            System.out.println(qsf);
            return;
        }
        
        for(int col=0;col<chess.length;col++)
        {
            chess[row][col]=1;            printNQueen(chess, qsf+row+""+col+"", row);
            chess[row][col]=0;
        }
    }
    public static void main(String[] args)
    {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the no of Row/Column :");
    int n = sc.nextInt();
    int [][]chess= new int[n][n];

        printNQueen(chess,"",0);

    }
}
