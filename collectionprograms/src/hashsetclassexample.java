import java.util.ArrayList;
import java.util.HashSet; //uses hashtable to store the elements.It extends AbstractSet class and implements Set interface(that extends the collection interface).
import java.util.Iterator;


/*Difference between List and Set:List can contain duplicate elements whereas Set contains unique elements only.*/ 

public class hashsetclassexample {
    
    public static void main(String args[]){
        
        /* object of ArrayList class is arraylist */
        ArrayList<String> al = new ArrayList<String>(); //creating object of ArrayList class(means creating arraylist),here al is arraylist & String is type of values stored in al(arraylist)//
        al.add("ankit");  // // add() method is inherited from collection interface & defined in AbstractList class(that implements the List interface first)
        al.add("arpit");
        al.add("amit");
        al.add("amit");
        al.add("vikesh");
    
        System.out.println("List can contain duplicate elements, see below:");
        Iterator itr =al.iterator(); //iterator() method is inherited from collection interface & defined in AbstractList class (this method return the iterator)
        while(itr.hasNext())
            System.out.println(itr.next());
        
        
        
        
    /* object of HashSet class is hashset */
    HashSet<String> hs = new HashSet<String>(); //creating object of HashSet class(means creating hashset),here hs is hashset & String is type of values stored in hs(hashset)//
    hs.add("ankit");  // add() method is inherited from collection interface & defined in AbstractSet class(that implements the Set interface first)
    hs.add("arpit");
    hs.add("amit");
    hs.add("amit");
    hs.add("vikesh");
      
    System.out.println("Set contains unique elements only , see below:");
    Iterator itr1 =hs.iterator(); //iterator() method is inherited from collection interface & defined in AbstractSet class  (this method return the iterator)
        while(itr1.hasNext())
            System.out.println(itr1.next());
            
            
}
}
