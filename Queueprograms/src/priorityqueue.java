// robert lafore
/* it is an ascending priority queue in which the item with smallest key(value) has the highest priority & will be access first by remove method*/  
/* we dont need to use front and rear , we can perform all operation by countitems */
public class priorityqueue {
    
    int maxsize;
    int arr[];
    int countitems;
   
    priorityqueue(int length)
    {
    maxsize=length;
    arr=new int[maxsize];
    countitems=0;
        
    }
    
    public void insert(int item)    //
    {
        int j;
        if(countitems==0)     //if no items
        arr[countitems++]=item;  // insert at 0 
        else                    // if items
        {
            for( j=countitems-1;j>=0;j--)  //start at end
            {
                if(item>arr[j])    // if new item larger
                    arr[j+1]=arr[j];  // shift upward
                else
                break;
            }
                arr[j+1]=item;
                countitems++;
                }
            
        }
    
    
    public int remove()   // remove minimum item(key or value) because it has highest priority to remove
    {
        return arr[--countitems];
    }
    
    public int peekmin()  //peek at minimum item(minimum value)
    {
        return arr[countitems-1];
    }
    
    public boolean isempty()
    {
        return (countitems==0);
    }
     
    public boolean isfull()
     {
         return (countitems==maxsize);
     }
    
    
}
class PriorityQApp
{
public static void main(String[] args)
{
priorityqueue obj = new priorityqueue(5);
obj.insert(30);
obj.insert(50);
obj.insert(10);
obj.insert(40);
obj.insert(20);


while( !obj.isempty() )
{
int item = obj.remove();
System.out.print(item + " "); // 10, 20, 30, 40, 50
} // end while
System.out.println(" ");
} // end main()
//-------------------------------------------------------------
} // end class PriorityQApp
