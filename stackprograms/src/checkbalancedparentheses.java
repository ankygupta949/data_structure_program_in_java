// robert lafore

import java.util.Scanner;

class stack{
    int maxsize;
    char arr[];
    int top;
 
    stack(int length)
    {
        maxsize=length;
        arr= new char[maxsize];
        top=-1;
    }
    
    public void push(char item){
        arr[++top]=item;
    }
    
    public char pop(){
       return arr[top--];
        
    }
    
    public boolean isEmpty() // true if stack is empty
{
return (top == -1);
}
    
}


public class checkbalancedparentheses {
    String input;
    checkbalancedparentheses(String str)
    {
        input=str;
    }
    public void check(){
        int size=input.length();
        stack st = new stack(size);
        for(int i=0;i<size;i++){
         char ch=input.charAt(i);
         switch(ch)
         {
             case '{':
                 case'[':
                 case '(':
                     st.push(ch);
                     break;
                     
                 case ')':
                 case ']':
                 case '}':
               if(!st.isEmpty())
               {
                   char ch1=st.pop();
                   if ( (ch=='}' && ch1!='{') || (ch==']' && ch1!=']') || (ch==')' && ch1!=')') )
                    System.out.println("error :" +ch+ "at" +i);
                  
               }
                     else
               {
                   System.out.println("error :" +ch+ "at" +i);
               }
                     break;
                 default:
                         break;
         }
         
        }
        if( !st.isEmpty() )
System.out.println ("Error: missing right delimiter");
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1= sc.nextLine();
        checkbalancedparentheses obj = new checkbalancedparentheses(str1);
        obj.check();
    }
    
    
}
