// robert lafore

public class circularqueue {
    int maxsize;
    int front;      
    int rear;
    int arr[];
    int countitems;
    
    
    circularqueue(int length)
    {
        maxsize=length;
        arr= new int[maxsize];
         front=0;
         rear=-1;
         countitems=0;
    }
    
    
    public void insert(int item)  /* insertion at rear*/
    {
        if(rear==maxsize-1)
            rear=-1;
        arr[++rear]=item;
        countitems++;
    }
    
    public int remove()    /* remove or deletion at front*/
    {
        int temp=arr[front++];
        if(front==maxsize)
            front=0;
        countitems--;
        return temp;
    }
    
    public int peekfront() /* peek item at the front*/
    {
        return arr[front];
    }
    
    public boolean isempty()  /* return true if queue is empty*/
    {
     return (countitems==0);   
    }
    
    public boolean isfull() /* return true if queue is full*/ 
    {
        return (countitems==maxsize);
    }
    
    public int size()  /* return the size of queue*/
    {
        return countitems;
    }


public static void main(String args[])
{
circularqueue obj= new circularqueue(5);
obj.insert(10);
obj.insert(20);
obj.insert(30);
obj.insert(40);

obj.remove();
obj.remove();
obj.remove();

obj.insert(50);
obj.insert(60);
obj.insert(70);
obj.insert(80);

System.out.println("item at front is:"+obj.peekfront());

while(!obj.isempty())
{
    int n=obj.remove();
    System.out.println(n);
}
}

}