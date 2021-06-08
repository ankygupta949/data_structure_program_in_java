import java.util.Stack;   //It extends Vector class 
import java.util.Iterator;
public class stackclassexample {
    
    
    public static void main(String args[])
    {
        /* object of Stack class is stack */
     Stack<String> stk= new Stack<String>(); //creating object of ArrayList class(means creating stack),here stk is stack & String is type of values stored in stk(stack)//
     stk.push("hello");
     stk.push("my");
     stk.push("name");
     stk.push("is");
     stk.push("ankit");
     
     
     while(!stk.empty())
     {
         System.out.println(stk.pop());
     }
         
    }
}
