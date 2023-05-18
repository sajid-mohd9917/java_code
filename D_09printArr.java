import java.util.Scanner;

public class D_09printArr {

//     public static void displayArr(int []arr, int ind)
// {
//     if(ind==arr.length)
//     {
//         return;
//     }
//     System.out.print(arr[ind]+" ");
//     displayArr(arr,ind+1);
// }

   
public static void displayArrRev(int []arr, int ind)
{
    if(ind==arr.length)
    {
        return;
    }
    displayArrRev(arr,ind+1);

    System.out.print(arr[ind]);
    System.out.print(" ");

    
} 

    public static void main(String[] args)
    {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the size of arr :");
    int size = sc.nextInt();
    int[]arr = new int[size];
    for(int i =0; i<arr.length;i++)
    {
        System.out.printf("arr[%d] = ",i);
        arr[i]=sc.nextInt();
    }

    // System.out.println("element of arr :");
    // displayArr(arr,0);

    System.out.println("element of arr in reverse order :");
    displayArrRev(arr,0);



    }
}
