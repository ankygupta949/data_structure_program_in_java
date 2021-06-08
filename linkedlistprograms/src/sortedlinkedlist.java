//robert lafore
//sorted linkedlist in ascending order

class Node4  //this class is used to create node of linked list & a object of this class is a node*/
{
    int item;
    Node4 next;
    
    public Node4(int data)
    {
        item=data;
    }
    
    public void displayitem()
    {
        System.out.print("{"+item+"}");
    }
}
public class sortedlinkedlist {
    Node4 first; /* refer to first node on list */
    
    sortedlinkedlist()
    {
        first=null;
    }
    
    public void insert(int data)  /* insert node at proper place in sorted order */
    {
        Node4 newnode = new Node4(data); //make or create a new node
        Node4 current=first;
        Node4 previous=null;
        while(current !=null && data>current.item)
        {
            previous=current;
            current=current.next;
        }
        if(previous==null) //if list is empty
        first=newnode;
        else
       previous.next=newnode;
            
        newnode.next=current;
        
    }
     
    public Node4 deletefirst()
   {
       Node4 temp=first;
       first=first.next;
       return temp;
   }
   
   public void displaylist() 
   {
       Node4 current=first;
       System.out.print("sortedlist:");
       while(current!=null)
       {
           current.displayitem();
           current=current.next;
       }
       System.out.println();
   
    }
   
   public static void main(String args[])
   {
       sortedlinkedlist sl1obj = new sortedlinkedlist();
       sl1obj.insert(30);
       sl1obj.insert(20);
       sl1obj.insert(15);
       sl1obj.insert(25);
       sl1obj.insert(10);
       sl1obj.insert(35);
       sl1obj.insert(5);
       
    sl1obj.displaylist();
    System.out.println("item at first node in the list:"+sl1obj.first.item);
    Node4 a=sl1obj.deletefirst();
    System.out.println("item of deleted node:"+a.item);
    System.out.println("after deletion");
    sl1obj.displaylist();
       
   }
}
