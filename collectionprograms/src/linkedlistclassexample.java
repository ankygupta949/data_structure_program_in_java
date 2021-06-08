import java.util.LinkedList;  //Java LinkedList class uses doubly linked list to store the elements. It extends the AbstractList class and implements List(that extends the collection interface) and Deque interfaces.
import java.util.Iterator;


public class linkedlistclassexample {
    
    public static void main(String args[]){
     
        /* object of LinkedList class is linkedlist */
        LinkedList<String> l1 = new LinkedList<String>(); //creating object of LinkedList class(means creating linkedlist),here l1 is linkedlist & String is type of values stored in l1(linkedlist)// 
        
        l1.add("ankit");  // add() method is inherited from collection interface & defined in AbstractList class(that implements the List interface first)
        l1.add("arpit");
        l1.add("amit");
        l1.add("prateek");
        
        
        System.out.println(" first method to print the elements by using iterator:");
        Iterator itr =l1.iterator(); //iterator() method is inherited from collection interface & defined in AbstractList class  (this method return the iterator)
    
        
        while(itr.hasNext())
            System.out.println(itr.next());
    
    
        System.out.println(" second method to print the elements by using foreach loop");
        for(String str:l1)
            System.out.println(str);
    }
    }
    
    

