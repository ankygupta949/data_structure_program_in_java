//robert lafore


class Node8 //this class is used to create node of linked list &  object of this class is a node*/
{
    int item;
    Node8 next;
    Node8 previous;


public Node8(int data)
{
item=data;
}

public void displayitem()
{
    System.out.print("{"+item+"}");
            
}

}

 class doublylinkedlist {
    Node8 first;  /*refer to first node on list*/
    Node8 last;   /*refer to last node on list*/
    
    public doublylinkedlist()
    {
        first=null;
        last=null;
    }
    
    public boolean isempty() //return true if list is empty
    {
        return (first==null);
    }
    
    public void insertfirst(int data) //insert at beg
    {
        Node8 newnode = new Node8(data); //make or create a new node
        if(isempty()) 
            last= newnode;
        else
            first.previous=newnode;
        newnode.next=first;
        first=newnode;
    }
    
    public void insertlast(int data)
    {
        Node8 newnode = new Node8(data);
        if(isempty())
            first=newnode;
        else
        last.next=newnode;
            newnode.previous=last;
        
        last=newnode;
    }
    
    public void insertafter(int key,int data)  /*here key is also a data or item after which newnode is inserted*/
    {
       Node8 newnode = new Node8(data); 
     Node8 current=first;
     while(current.item!=key)
     {
         if(current==null) //if end of list
             break;
         current=current.next;
     }
     if(current==last) //in this if-else condition, we define only about next of newnode ,previous of newnode will define later
     {
         newnode.next=null; 
         last=newnode;
     }
     else
     {
         newnode.next=current.next;
         current.next.previous=newnode;
         
     }
       
     //define about previous of newnode is below
     newnode.previous=current;
     current.next=newnode;
     
    }
    
    public Node8 deleteFirst() // delete first link
{ // (assumes non-empty list)
  Node8 temp = first;
  if(first.next == null) // if only one item
last = null; // 
else
first.next.previous = null; 
first = first.next; 
return temp;
}
    
    public Node8 deleteLast() 
{ // (assumes non-empty list)
    Node8 temp = last;
if(first.next == null) // if only one item
first = null; 
else
last.previous.next = null; 
last = last.previous; 
return temp;
}
    public Node8 deleteKey(int key) // delete item w/ given key
{ // (assumes non-empty list)
Node8 current = first; // start at beginning

while(current.item != key) // until match is found,
{

if(current.next == null)
return null; // didn’t find it

current=current.next;
}
if(current==first) // found it; first item?
first = current.next; 
else // not first
    
current.previous.next = current.next;
if(current==last) // last item?
last = current.previous; 
else // not last
current.next.previous = current.previous;
return current; 
}
    
     public void forwarddisplaylist()
     {
        Node8 current=first;
        while(current!=null)
        {
            current.displayitem();;
            current=current.next;
        }
     }  
 
     public void displayBackward()
{
System.out.print("List (last-->first):" );
Node8 current = last; // start at end
while(current != null) // until start of list,
{
current.displayitem(); // display data
current = current.previous; // move to previous link
}
}
     
     public static void main(String args[])
        {
         doublylinkedlist list1obj= new doublylinkedlist();
         list1obj.insertfirst(20);
         list1obj.insertfirst(30);
         list1obj.insertfirst(25);
         list1obj.insertfirst(45);
         
         list1obj.insertlast(10);
         
         list1obj.insertafter(30,35);
         
         
         list1obj.forwarddisplaylist();
         System.out.println();
         list1obj.displayBackward();
         
         
         System.out.println(" ");
         Node8 dltnode=list1obj.deleteKey(30);
            System.out.println("after deletion of "+dltnode.item);
         list1obj.forwarddisplaylist();
         
         
        }
     }
     
    

