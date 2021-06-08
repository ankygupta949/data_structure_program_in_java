

/*Write a function to get the item of intersection point of two Linked Lists.*/


/*METHOD:Using difference of node counts
1) Get count of the nodes in first list, let count be c1.
2) Get count of the nodes in second list, let count be c2.
3) Get the difference of counts d = abs(c1 – c2)
4) Now traverse the bigger list from the first node till d nodes so that from here onwards both the lists have equal no of nodes.
5) Then we can traverse both the lists in parallel till we come across a common node. */

class Node10  //this class is used to create node of linked list & a object of this class is a node*/
{
    int item;
    Node10 next;
    
    public Node10(int data)
    {
     item=data;   
    }
    
    public void displayitem()
    {
        System.out.print("{"+item+"}");
    }
}


public class getitemofintersectionnodeoftwolinkedlist {
    Node10 first; //refer to first node in list
    
   public getitemofintersectionnodeoftwolinkedlist()
    {
        first=null;
    }
    
    public void insertfirst(int data) /* insert at beg*/
    {
        Node10 newnode = new Node10(data); //make or create a new node
        newnode.next=first;
        first=newnode;
    }
    
    public Node10 deletefirst()
    {
        Node10 temp=first;
        first=first.next;
        return temp;
    }
    
    public boolean isempty() //return true if list is empty 
    {
        return (first==null);
    }
 
    /*function to get the intersection point of two linked
    lists head1 and head2 */
    int getNode(Node10 list1first, Node10 list2first) {
        int c1 = countnode(list1first);
        int c2 = countnode(list2first);
        int d;
 
        if (c1 > c2) {
            d = c1 - c2;
            return _getIntesectionNode(d, list1first,list2first);
        } else {
            d = c2 - c1;
            return _getIntesectionNode(d,list2first, list1first);
        }
    }
 
    /* function to get the intersection point of two linked
     lists head1 and head2 where head1 has d more nodes than
     head2 */
    int _getIntesectionNode(int d, Node10 list1first, Node10 list2first) {
        int i;
        Node10 current1 = list1first;
        Node10 current2 = list2first;
        for (i = 0; i < d; i++) {
            if (current1 == null) {
                return -1;
            }
            current1 = current1.next;
        }
        while (current1 != null && current2 != null) {
            if (current1.item == current2.item) {
                return current1.item;
            }
            current1 = current1.next;
            current2 = current2.next;
        }
 
        return -1;
    }
    
    public int countnode(Node10 list1first)
    {
        Node10 current=list1first;
        int count=0;
        while(current!=null)
        {
            current=current.next;
            count++;
        }
        return count;
    }
    
    public void displaylist()
    {
        Node10 current=first;
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
         getitemofintersectionnodeoftwolinkedlist list1obj=new getitemofintersectionnodeoftwolinkedlist();
        list1obj.insertfirst(10);
        list1obj.insertfirst(25);
        list1obj.insertfirst(15);
        list1obj.insertfirst(65);
        list1obj.insertfirst(55);
        list1obj.insertfirst(70);
        
        list1obj.displaylist();   // it will print linkedlist:{70}{55}{65}{15}{25}{10}
        
        
        getitemofintersectionnodeoftwolinkedlist list2obj=new getitemofintersectionnodeoftwolinkedlist();
        list2obj.insertfirst(10);
        list2obj.insertfirst(25);
        list2obj.insertfirst(15);
        list2obj.insertfirst(85);
        list2obj.insertfirst(80);
        
        list2obj.displaylist(); //it will print linkedlist:{80}{85}{15}{25}{10}
        
        /*  as we can see, item of intersection point or node of two above two list is 15  */
        
        System.out.println("item of node which is intersection point of two list:"+list2obj.getNode(list1obj.first,list2obj.first)); // it will print 15
    }
}
