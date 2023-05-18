import java.util.Scanner;

public class D_13printSSQ
{
   public static void printSSQ(String inpstr, String outstr)
   {
    if(inpstr.length()==0)
    {
        System.out.println(outstr);
        return;
    }
    char ch = inpstr.charAt(0);
    String rInsb= inpstr.substring(1);

    printSSQ(rInsb,outstr+ch);
    printSSQ(rInsb,outstr+"");



   }
    public static void main(String[] args)
    {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the string :\n");
    String inpstr = sc.next();
    printSSQ(inpstr,"");

    }
}
