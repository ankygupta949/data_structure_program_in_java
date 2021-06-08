// robert lafore
import java.io.*;
import java.util.Scanner;



 class charpushnpop {
    int maxsize;
    char arr[];
    int top;
    
    charpushnpop(int length)
    {
     maxsize=length;
     arr=new char[maxsize];
     top=-1;
    }
    void push(char item)
    {
        arr[++top]=item;
    }
    
    char pop()
    {
      return arr[top--];
     
     
    }
    
    public boolean isempty()
    {
       return (top==-1); 
    }

    
    
    
}

public class reversestring {
    public String input1;
    public String output1;
    
    reversestring(String str)
    {
        input1=str;
    }
    
  public String doreverse()
    {
        int len=input1.length();
        
        charpushnpop obj= new charpushnpop(len);
        for(int i=0;i<len;i++)
        {
            obj.push(input1.charAt(i));
        }
        
        
   output1="";
    while(!obj.isempty())
    {
        char b=obj.pop();
        output1=output1 + b;
    }
    return output1;
   
    }
  
  public static String getstring()
  {
   
       
      Scanner sc = new Scanner(System.in);
      String s=sc.nextLine();
      return s;
         
   
  }
    
    public static void main(String args[]) 
    {
        
       String result,input;
        
        
        System.out.println("enter string");
        
        
       
       input= getstring();
        
        reversestring obj= new reversestring(input);
       result=obj.doreverse();
       System.out.println("reverse string:"+result);
        
    }
    
    
}

