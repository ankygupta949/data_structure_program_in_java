
class Node6  //this class is used to create node of linked list & a object of this class is a node*/
{
    int item;
    Node6 next;
    
    public Node6(int data)
    {
     item=data;   
    }
    
    public void displayitem()
    {
        System.out.print("{"+item+"}");
    }
}

class linkedlist{
    Node6 first; //refer to first node in list
    
    public linkedlist()
    {
        first=null;
    }
    
    public void insertfirst(int data) /* insert at beg*/
    {
        Node6 newnode = new Node6(data); //make or create a new node
        newnode.next=first;
        first=newnode;
    }
    
    public Node6 deletefirst()
    {
        Node6 temp=first;
        first=first.next;
        return temp;
    }
    
    public boolean isempty() //return true if list is empty 
    {
        return (first==null);
    }
    
    public void displaylist()
    {
        Node6 current=first;
        System.out.print("linkedlist:");
        while(current!=null)
        {
            current.displayitem();
            current=current.next;
        }
        System.out.println();
    }
    
    public void reverselist()
    {
        
        Node6 current=first;   //here,we use the first(object or reference variable) to change,so changes(made in function) stored in this object(also for after the function) 
        Node6 previous= null;
        Node6 curnext=null;
        while(current!=null)
        {
            curnext=current.next;
            current.next=previous;
            previous=current;
            current=curnext;
        }
       first=previous;   /*changes stored*/
        
      }
    public static void main(String args[])
    {
        linkedlist list1obj=new linkedlist();
        list1obj.insertfirst(10);
        list1obj.insertfirst(25);
        list1obj.insertfirst(15);
        list1obj.insertfirst(35);
        
        list1obj.displaylist();
        System.out.println("item at first node in the list:"+list1obj.first.item);  // here ans is 35
        
        
        list1obj.reverselist();
        
        list1obj.displaylist();
        System.out.println("item at first node in the list:"+list1obj.first.item);    // // here ans is 10
       
       
    }
}
