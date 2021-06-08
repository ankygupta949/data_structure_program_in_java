
/* concept(reverse stack() and insertatbottom() method ) taken from the page (Reverse a stack using recursion) of geeksforgeeks website*/

class stack1//robert lafore
{
    int maxsize;
    int arr[];
    int top;
    
    public stack1(int length)
    {
        maxsize=length;
        arr=new int[maxsize];
        top=-1;
    }
    
    public void push(int item)
    {
        arr[++top]=item;
    }
    
    public int pop()
    {
        return arr[top--];
    }
    
    public boolean isempty() //return true if top==-1
    {
        return(top==-1);
    }
    
    public void printstack()
    {
        int current=top;
        while(current!=-1)
        System.out.println(arr[current--]);
    }
    
    
    
    public void reversestack()
    {
        
      if(!isempty())
      {
         int temp=pop();
          reversestack();
      insertatbottom(temp); //here first value of temp will be 15 then 25,10 and 35
      }
      
    }
    
    public void insertatbottom(int item)
    {
        if(isempty())
        {
            push(item);
        }
        else
        {
            int temp=pop();
            insertatbottom(item);
            push(temp);
        }
    }
    
    
    
  
}


public class reversestackusingrecursion {
    
    public static void main(String args[])
    {
        stack1 obj = new stack1(5);
        obj.push(15);
        obj.push(25);
        obj.push(10);
        obj.push(35);
        
        System.out.println(" stack:");
        obj.printstack();
       
        
        
        
        System.out.println("reverse stack:");
         obj.reversestack();
         obj.printstack();
        
}
}
