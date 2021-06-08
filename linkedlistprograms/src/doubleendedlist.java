//robert lafore
//in double ended list, there is reference to first node and last node both
 
class Node1 //this class is used to create node of linked list & a object of this class is a node*/
 {
     int item;
     Node1 next;
     
     public Node1(int data) //constructor
     {
         item=data;
     }
     
    public void displayitem()
     {
         System.out.print("{"+item+"}");
     }
 }
 class doubleendedlist  /* or firstlastlist*/
{
    Node1 first; /*refer to first node on list*/
    Node1 last;  /*refer to last node on list*/
    
    doubleendedlist() //constructor
    {
        first=null;
        last=null;
    }
    
    public boolean isempty() /*return true if list is empty*/ 
    {
        return(first==null);
    }
    
    public void insertfirst(int data) /*insert at beg*/ 
    {
        Node1 newnode = new Node1(data); //make or create a new node
        if(isempty())
            last=newnode;
        else
        newnode.next=first;
        first=newnode;
    }
    
    public void insertlast(int data) /* insert at end*/
    {
        Node1 newnode = new Node1(data); //make a new node
        if(isempty())
            first=newnode;
        else
        last.next=newnode;
        last=newnode;
           
    }
    
    public Node1 deletefirst()
    {
        Node1 temp=first;
        first=first.next;
        return temp;
    }
    
    public void displaylist()
    {
        Node1 current=first;
        System.out.print("list(first->last)");
        while(current!=null)
        {
            current.displayitem();
            current=current.next;
        }
        System.out.println(); /* it is only used to print output(next output) on next line*/
    }
    
    public static void main(String args[])
    {
        doubleendedlist list1obj = new doubleendedlist();
        list1obj.insertfirst(10);
       list1obj.insertfirst(20);
       list1obj.insertfirst(30);
       
       list1obj.displaylist();
       
       list1obj.insertlast(80);
       System.out.println("item at first node in the list:"+list1obj.first.item);
       System.out.println("item of node insert at last:"+list1obj.last.item);
       
      Node1 a= list1obj.deletefirst();
      System.out.println("item of deleted node:"+a.item);
       
       list1obj.displaylist();
       
       System.out.println("item at first node in list:"+list1obj.first.item);
       System.out.println("item at last node in list:"+list1obj.last.item);
               
               }
}
