
import java.util.Arrays;
import java.util.Scanner;




 class Permutation {

public static void printDuplicates(String str,String prefix)
{
    int count=0;
    if(str.length()==0)
    {
        System.out.println(prefix);
    }
    else
    {
        for (int i = 0; i<str.length();i++)
        {
            if(i>0)
            {
                if(str.charAt(i)==str.charAt(i-1))
                {
                    continue;
                }
            }

                printDuplicates(str.substring(0, i)+str.substring(i+1, str.length()),prefix+str.charAt(i));

        }
    }
}
    public static String sort(String str){
        char arr[]=str.toCharArray();
        Arrays.sort(arr);
        String str1=new String(arr);
return str1;
        // Please Implement the sorting function, I was lazy enough to do so 
    }
public static void main(String [] args)
{
    String test="rrbrr";
    test = sort(test);
    printDuplicates(test,"");
}
}