
//robert lafore
//sorted linkedlist in ascending order

class Node5  //this class is used to create node of linked list & a object of this class is a node*/
{
    int item;
    Node5 next;
    
    public Node5(int data)
    {
        item=data;
    }
    
    public void displayitem()
    {
        System.out.print("{"+item+"}");
    }
}
 class sortedlinklist {
    Node5 first; /* refer to first node on list */
    
    sortedlinklist()
    {
        first=null;
    }
    
    public void insert(int data)  /* insert node at proper place in sorted order */
    {
        Node5 newnode = new Node5(data); //make or create a new node
        Node5 current=first;
        Node5 previous=null;
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
     
    public Node5 deletefirst()
   {
       Node5 temp=first;
       first=first.next;
       return temp;
   }
   
   public void displaylist() 
   {
       Node5 current=first;
       while(current!=null)
       {
           current.displayitem();
           current=current.next;
       }
       System.out.println();
   
    }
   
  
}

 class mergetwosortedlist {
   Node5 newlistfirst; 
   
   mergetwosortedlist()
   {
       newlistfirst=null;
   }
                                                                        //(method2)another way to define mergelist    
   public void mergelist(Node5 list1first,Node5 list2first)                 //mergelist(sortedlinklist list1,sortedlinklist list2 )
   {                                                                     //{
       Node5 current1=list1first;                                          // Node5 current1=list1.first;
       Node5 current2=list2first;                                          // Node5 current2=list2.first; 
                                                                         // remaining same to the end 
       if(current1.item>current2.item) //this condition is only used to get newlistfirst in the new list
       {
          newlistfirst=current2; 
          current2=current2.next;
       }
       else
       {
           newlistfirst=current1;
           current1=current1.next;
       }
       
      Node5 p=newlistfirst;
      
       while(current1!=null && current2!=null)
       {
        
          if(current1.item>current2.item) 
          {
              p.next=current2;
              current2=current2.next;
          }
          else
          {
              p.next=current1;
              current1=current1.next;
          }
          p=p.next;
       }
       
       if(current1!=null)
           p.next=current1;
       if(current2!=null)
           p.next=current2;
     
   }
   
   public void displaymergelist()
   {
       Node5 current=newlistfirst;
       while(current!=null)
       {
           current.displayitem();
           current=current.next;
       }
   }
    
     public static void main(String args[])
   {
       sortedlinklist sl1obj = new sortedlinklist();
       sl1obj.insert(20);
       sl1obj.insert(10);
       sl1obj.insert(30);
       sl1obj.insert(50);
       sl1obj.insert(40);
       System.out.print("sortedlist1:");
       sl1obj.displaylist();
     System.out.println("fourth item in first sorted list:"+sl1obj.first.next.next.next.item);   
       sortedlinklist sl2obj = new sortedlinklist();
       sl2obj.insert(15);
       sl2obj.insert(5);
       sl2obj.insert(25);
       sl2obj.insert(45);
       sl2obj.insert(35);
       System.out.print("sortedlist2:");
       sl2obj.displaylist();
     System.out.println("fourth item in second sorted list:"+sl2obj.first.next.next.next.item);
     
       mergetwosortedlist obj = new mergetwosortedlist();
       
      obj.mergelist(sl1obj.first,sl2obj.first);                      //obj.mergelist(sl1obj,sl2obj);
      
     System.out.print("mergelist:");
     obj.displaymergelist();
     System.out.println();
     
     /*we can see,when we passed the object or reference variable(first) to merge list method or change in the object, changes(made in function) also stored in sl1obj.first and sl2obj.first (also for after the function),see these changes below*/
     System.out.println("fourth item in first sorted list:"+sl1obj.first.next.next.next.item); 
     System.out.println("fourth item in second sorted list:"+sl2obj.first.next.next.next.item);
     System.out.println("first item in merge sorted list:"+obj.newlistfirst.item);
      
      
       
       
      
       
    
       
   }
    
}
