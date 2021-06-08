/*Rotate a Linked List
Given a singly linked list, rotate the linked list counter-clockwise by k nodes. Where k is a given positive integer. 
* For example, if the given linked list is 10->20->30->40->50->60 and k is 4, the list should be modified to 50->60->10->20->30->40. 
* Assume that k is smaller than the count of nodes in linked list. 
 */


class Node9  //this class is used to create node of linked list & a object of this class is a node*/
{
    int item;
    Node9 next;
    
    public Node9(int data)
    {
     item=data;   
    }
    
    public void displayitem()
    {
        System.out.print("{"+item+"}");
    }
}

 public class rotatelinkedlist{
    Node9 first; //refer to first node in list
    
   public rotatelinkedlist()
    {
        first=null;
    }
    
    public void insertfirst(int data) /* insert at beg*/
    {
        Node9 newnode = new Node9(data); //make or create a new node
        newnode.next=first;
        first=newnode;
    }
    
    public Node9 deletefirst()
    {
        Node9 temp=first;
        first=first.next;
        return temp;
    }
    
    public boolean isempty() //return true if list is empty 
    {
        return (first==null);
    }
    
    public void rotate(int k)  //here k is number of element which will rotate
    {
        Node9 current=first; //here,we use the first(object or reference variable) to change,so changes(made in function) stored in this object(also for after the function) 
        if(k==0)
            return;
        int count=1;
        
        while(count<k && current!=null)
        {
            current=current.next;
            count++;
        }
        
        if(current==null)
            return;
        
      Node9 kthnode=current;
      while(current.next!=null)
          current=current.next;
      
      current.next=first; 
      first=kthnode.next; //changes stored
      kthnode.next=null; //remove loop
    }
    
    public void displaylist()
    {
        Node9 current=first;
        System.out.print("linkedlist:");
        while(current!=null)
        {
            current.displayitem();
            current=current.next;
        }
        System.out.println();
    }
    
    
    public static void main(String args[])
    {
         rotatelinkedlist list1obj=new rotatelinkedlist();
        list1obj.insertfirst(10);
        list1obj.insertfirst(25);
        list1obj.insertfirst(15);
        list1obj.insertfirst(35);
        list1obj.insertfirst(55);
        list1obj.insertfirst(70);
        
        list1obj.displaylist();  
     
        
        list1obj.rotate(4);
        System.out.println("after rotation:");
        list1obj.displaylist();

    }
 }
