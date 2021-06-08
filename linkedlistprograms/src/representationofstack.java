//robert lafore

//linkedlist representation of stack
// as we know that insertion and deletion in stack at the same end(beg)
/*so here we use insertfirst(int data) & deletefirst() method of linkedlist as push(int data) & pop() method */

class Node2 //this class is used to create node of linked list & a object of this class is a node*/
{
    int item;
    Node2 next;
    
    public Node2(int data) //constructor
    {
        item=data;
    }
    
    public void displayitem()
    {
        System.out.println("{"+item+"}");
    }
    
    
}

public class representationofstack  /* it is a class that provide linked list representation of stack*/
{  
    Node2 first; /* it is used as a top of stack*/
    
    representationofstack() //constructor
    {
        first=null;
    }
    
    public boolean isempty() //return true if stack is empty
    {
        return (first==null);
    }
    
    public void push(int data) //basically this method is insertfirst(int data) method of linkedlist
    {
        Node2 newnode = new Node2(data); //make or create a new node
        newnode.next=first;
        first=newnode;
    }
    
    public Node2 pop() //basically this method is deletefirst() method of linkedlist
    {
     Node2 temp=first;
     first=first.next;
     return temp;
    }
    
    public void displaystack() //basically this method is displaylist() method of linkedlist
    {
    Node2 current=first;
    System.out.println("stack:");
    while(current!=null)
    {
        current.displayitem();
        current=current.next;
    }
}
    
    public static void main(String args[])
    {
        representationofstack st1obj = new representationofstack();
        st1obj.push(10);
        st1obj.push(30);
        st1obj.push(25);
        st1obj.push(35);
        
        st1obj.displaystack();
        
        Node2 a=st1obj.pop();
        System.out.println("item of deleted node:"+a.item);
        
        System.out.println("after deletion");
        st1obj.displaystack();
        System.out.println("top item at stack:"+st1obj.first.item);
    }
}
