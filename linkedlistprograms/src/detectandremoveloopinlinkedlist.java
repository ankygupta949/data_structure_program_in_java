


class Node7  //this class is used to create node of linked list & a object of this class is a node*/
{
    int item;
    Node7 next;
    
    public Node7(int data)
    {
        item=data;
    }
    
    public void displayitem()
    {
        System.out.print("{"+item+"}");
    }
}
 class linklist {
    Node7 first; /* refer to first node on list */
    
    linklist()
    {
        first=null;
    }
    
    public void insertfirst(int data)  /* insert at beg*/
    {
         Node7 newnode = new Node7(data); //make or create a new node
        newnode.next=first;
        first=newnode;
        
    }
     
    public Node7 deletefirst()
   {
       Node7 temp=first;
       first=first.next;
       return temp;
   }
   
   public void displaylist() 
   {
       Node7 current=first;
       while(current!=null)
       {
           current.displayitem();
           current=current.next;
       }
       System.out.println();
   
    }
   
  
}



public class detectandremoveloopinlinkedlist {
    
    
   public void detectandremoveloop(Node7 listfirst)
   {
       Node7 slow=listfirst;
       Node7 fast=listfirst.next;
       
       while(fast!=null && fast.next!=null)
       {
           if(slow==fast)
               break;
           slow=slow.next;
           fast=fast.next.next;
       }
       
       if(slow==fast) //meetpoint
       {
           /*note: always distance between meet point(of slow and fast) and last node (of cycle) = distance between head and first node (of cycle)*/
	/*therefore, to remove loop,we use the slow pointer to point the head(see below)*/
	/* fast pointer is at meet point already*/
           slow=listfirst;
           while(slow!=fast.next)
           {
               slow=slow.next;
               fast=fast.next;
           }
           fast.next=null;
       }
   }
   public static void main(String args[])
   {
       linklist list1obj = new linklist();
       list1obj.insertfirst(10);
        list1obj.insertfirst(25);
        list1obj.insertfirst(15);
        list1obj.insertfirst(35);
        list1obj.insertfirst(40);
        
      list1obj.first.next.next.next.next.next=list1obj.first.next.next;     /* create loop  */
     //if we call displaylist() method here,there will be no output because of loop,so we will detect and remove loop by detectandremoveloop method(see below)
      detectandremoveloopinlinkedlist obj = new detectandremoveloopinlinkedlist();
     obj.detectandremoveloop(list1obj.first); /*we can see,when we passed the object or reference variable(first),so changes(made in function) stored in this object(also for after the function) */
       list1obj.displaylist();
        
   }
}
