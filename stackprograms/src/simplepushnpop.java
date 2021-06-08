// robert lafore
public class simplepushnpop {
    int maxsize;
    int arr[];
    int top;
    
    simplepushnpop(int length)
    {
     maxsize=length;
     arr=new int[maxsize];
     top=-1;
    }
    void push(int item)
    {
        arr[++top]=item;
    }
    
    int pop()
    {
      return arr[top--];
     
     
    }
    
    public boolean isempty()
    {
       return (top==-1); 
    }

    public static void main(String args[])
    {
        simplepushnpop obj= new simplepushnpop(5);
    obj.push(10);
    obj.push(20);
    obj.push(30);
    obj.push(40);
    obj.push(50);
    
    
    while(!obj.isempty())
    {
        System.out.println(obj.pop());
    }
   
    }
    
    
}
