//sort in decreasing order(large item at top)
/* concept( sortstack() and sortedinsert() method ) taken from the page (Reverse a stack using recursion) of geeksforgeeks website*/

class stack2 //robert lafore
{
    int maxsize;
    int arr[];
    int top;
    
    public stack2(int length)
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
    
    public int topitem()
    {
        return arr[top];
    }
    
    public void sortstack()
    {
        
      if(!isempty())
      {
         int temp=pop();
          sortstack();
      sortedinsert(temp);
      }
      
    }
    
    public void sortedinsert(int item)
    {
        if(isempty() || item>topitem())
        {
            push(item);
        }
        else
        {
            int temp=pop();
            sortedinsert(item);
            push(temp);
        }
    }
    
    
    
  
}


public class sortstackusingrecursion {
    
    public static void main(String args[])
    {
        stack2 obj = new stack2(5);
        obj.push(10);
        obj.push(25);
        obj.push(20);
        obj.push(35);
        
        System.out.println(" stack:");
        obj.printstack();
       
        
        
        
        System.out.println("sort stack in decreasing order:");
         obj.sortstack();
         obj.printstack();
        
}
}
