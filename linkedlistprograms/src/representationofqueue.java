// robert lafore
// linkedlist reprentation of queue
// as we know that in queue,insertion is done at rear and deletion is done at front
/* so here we use insertlast(int data) method of double ended linkedlist for insertion and deletefirst() method of linkedlist or double ended linkedlist for deletion */

class Node3 //this class is used to create node of linked list & a object of this class is a node*/
{
    int item;
    Node3 next;
    
    public Node3(int data)
    {
        item=data;
    }
    
    public void displayitem()
    {
        System.out.print("{"+item+"}");
    }
}


public class representationofqueue  /* it is a class that provide linked list representation of queue*/
{
   Node3 first; /* it is used as front of queue*/
   Node3 last; /* it is used as rear of queue*/
   
   representationofqueue()
   {
       first=null;
       last=null;
   }
   
   public boolean isempty() //return true if queue is empty
   {
       return (first==null);
   }
   
   public void insertlast(int data)
   {
       Node3 newnode = new Node3(data); //make or create a new node
       if(isempty())  //if queue is empty
           first=newnode;
       else
           last.next=newnode;
       last=newnode;
   }
   
   public Node3 deletefirst()
   {
       Node3 temp=first;
       first=first.next;
       return temp;
   }
   
   public void displayqueue() //basically this method is displaylist() method of linkedlist
   {
       Node3 current=first;
       System.out.print("QUEUE:");
       while(current!=null)
       {
           current.displayitem();
           current=current.next;
       }
       System.out.println();
   }
   
   public static void main(String args[])
   {
       representationofqueue q1obj = new representationofqueue();
       q1obj.insertlast(10);
       q1obj.insertlast(30);
       q1obj.insertlast(25);
       q1obj.insertlast(35);
       
       q1obj.displayqueue();
       
       Node3 a=q1obj.deletefirst();
       System.out.println("item of deleted node:"+a.item);
       
       System.out.println("after deletion:");
       
       q1obj.displayqueue();
       
       System.out.println("front item in queue:"+q1obj.first.item);
       System.out.println("rear item in queue:"+q1obj.last.item);
   }
}
