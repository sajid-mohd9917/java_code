import java.util.ArrayList;
import java.util.Scanner;

public class D_12getSSQ {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // String str = "helloWorld";

        // for(int i=0; i<str.length();i++)
        // {
        // System.out.println(str.charAt(i));
        // // }

        // int ind = str.indexOf('W');
        // System.out.println(ind);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);
        System.out.println(list.size());



        for(int i=0;i<list.size();i++)
        {
            int val = list.get(i);
            System.out.println(val);
        }
        
        for(int i:list)
        {
            System.out.println(i);
        }

        System.out.println(list+" "+"\n size is "+ list.size());
        list.set(2,300);
        System.out.println(list+" "+"\n size is "+ list.size());
            

    }
}

*/

public static ArrayList<String> gss(String str)
{
    if(str.length()==0)
    {
        ArrayList<String> bres = new ArrayList<>();  // base result
        bres.add("");
        return bres;
    }
    char ch = str.charAt(0);  // first char of string
   String rosb= str.substring(1);   // rest of the subString

   ArrayList<String>rres= gss(rosb);   //pass  restSubstring of the string to the method
                                        
   ArrayList<String> mres= new ArrayList<>();   //creat new arrayList


    for(String i:rres)
    {
        mres.add(""+i);
       
    }

    
    for(String i:rres)
    {
        mres.add(ch+i);
    }


    return mres;
   
}


public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the String:");
    String str = sc.next();


    // ArratList<String> str = new ArratList<>();
   ArrayList<String> res= gss(str);  
   System.out.println(res);  
}
}