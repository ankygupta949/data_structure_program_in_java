//robert lafore
/* this program is same as program in robert lafore,only we changed name of classes & method*/

 class Node  /* or class link(in robert lafore), basically this class is used to create node of linkedlist*/ 
{            /* object of this class is a node of linkedlist*/
    int item;
    Node next;
    
    public Node( int data) //constructor
    {
        item=data;
    }
    
    public void displayitem()  
    {
        System.out.print("{"+item+ "}");
    }
    
}


public class linkedlistbasicoperation {
    Node first; /* or head it is used to refer to first node on list*/
    
    linkedlistbasicoperation() //constructor
    {
        first=null;
    }
    
    public void insertfirst(int data) /* insert at beg*/
    {
        Node newnode= new Node(data);  //make or create a new node
        newnode.next=first;
        first=newnode;
    }
    
     public void insertafter(int numaft,int item1){ //this method insert the item (item1) after  the item (numafter)
        Node current=first;
        while(current!=null && current.item!=numaft){
            current = current.next;
        }
        Node newnode = new Node(item1);
        newnode.next=current.next;
        current.next=newnode;
        
    }
    
    public int countnode()
    {
                              //as we know ,to store the value of one variable(A) in another variable(B),variable(B) should has same type as type of variable(A).
        Node current=first;  //because of above comment,to store the value of first in current,current should has same type as type of first(here type is Node)
        int count=0;
        while(current!=null)
        {
            current=current.next;
            count++;
        }
        return count;
    }
    
    public Node find(int data)
    {
        Node current=first;   //to store the value of first in current,current should has same type as type of first(here type is Node)
       while(current.item!=data)
       {
          if(current.next==null)  //if end of list
              return null;        //didnot find it
          current=current.next;
          }
       return current;
       }
    
  public Node deletefirst() /* delete at beg*/
    {
        Node temp=first;    //to store the value of first in temp, temp should has same type as type of first(here type is Node)
        first=first.next;
        return temp;
    }
     
    public Node deletebydata(int data){
        Node current=first;   //to store the value of first in current,current should has same type as type of first(here type is Node)
        Node previous = null;
        while(current.item!=data)
        {
            if(current.next==null) //if end of list
                return null;      // didnot find it
            previous=current;
            current=current.next;
        }
        if(current==first)
            first=first.next;
        else
            previous.next=current.next;
        return current;
    }
    
   
    
    public boolean isempty() /* return true if linkedlist is empty*/ 
    {
        return (first==null);
        
    }
    public void displaylist()
    {
        Node current=first;  //to store the value of first in current,current should has same type as type of first(here type is Node)
        System.out.print("list(first->last):");
        while(current !=null)
        {
            current.displayitem();
        current=current.next;
        }
        System.out.println(); /* it is only used to print output(next output) on next line*/
    }
    
    
    public static void main(String args[])
    {
        linkedlistbasicoperation list1obj = new linkedlistbasicoperation();  /* here we creating only 1 linklist,so we create only one object,if we have to create 2 linklist,then we create 2 object*/ 
    list1obj.insertfirst(10);
    list1obj.insertfirst(50);
    list1obj.insertfirst(30);
    list1obj.insertfirst(20);
    list1obj.insertfirst(60);
    list1obj.insertafter(30, 40);
    
    list1obj.displaylist();
    
    System.out.println("item at first node in the list:"+list1obj.first.item);
    
    System.out.println("total number of nodes:"+list1obj.countnode());
    
    Node a=list1obj.find(30);
    if(a!=null)
        System.out.println(a.item+":item is found");
    
    list1obj.displaylist();
    
    Node b =list1obj.deletebydata(40);
    System.out.println("item of deleted node:"+b.item);
    
    list1obj.displaylist();
    
    while(!list1obj.isempty())
    {
        Node x=list1obj.deletefirst();
        System.out.println("item of deleted node:"+x.item);
    }
    list1obj.displaylist();
    
    
    }
    
            }
