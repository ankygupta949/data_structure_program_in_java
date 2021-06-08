//method 1; without using package//
 
public class reversewordsingivenstring {
    
     public String revwords(String str)
    {
     String result="";
     String result1="";
    int len=str.length();
    for(int i=0;i<len;i++)
    {
       result=result +str.charAt(i);
        if(str.charAt(i)==' ')
        {
        result1=result + result1;
        result="";
        }
        if(i==len-1)
            result1=result +" " + result1 ;
    }
    return result1;
    }
     
     
    
    public static void main(String args[])
    {
        reversewordsingivenstring obj = new reversewordsingivenstring();
        String str1="hello my name is ankit";
        String res=obj.revwords(str1);
        System.out.println(res);
        
        
        
    }

    
}


//method 2: by using package

/*import java.util.Stack;
import java.util.Iterator;

public class reversewordsingivenstring {
    
    public void reverse(String s)
    {
        Stack<String> stk= new Stack<String>();
        
        int len=s.length();
        int j=0;
        for(int i=0;i<len;i++)
        {
            if(s.charAt(i)==' ')
            {
                
                stk.push(s.substring(j,i));
                j=i+1; // to remove the space
              
            }
            if(i==len-1)
                stk.push(s.substring(j,i+1));
            
          
        }
        
        while(!stk.empty())
     {
         System.out.print(stk.pop()+" ");
     }
    }
    
  public static void main(String args[])
    {
      reversewordsingivenstring  obj = new reversewordsingivenstring ();
      System.out.println("ankit is name my hello");
      obj.reverse("hello my name is ankit");
    }  
}
* */