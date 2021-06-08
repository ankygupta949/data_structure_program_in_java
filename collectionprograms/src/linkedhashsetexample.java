import java.util.LinkedHashSet; //contains unique elements only like HashSet. It extends HashSet class and implements Set interface(that extends the collection interface).  & maintains insertion order.
import java.util.Iterator;

public class linkedhashsetexample {

    
    public static void main(String args[]){
    
        /* object of LinkedHashSet class is linkedhashset */
        LinkedHashSet<String> lhs= new LinkedHashSet<String>();//creating object of LinkedHashSet class(means creating linkedhashset),here lhs is linkedhashset & String is type of values stored in lhs(linkedhashset)//
        lhs.add("ankit"); //add() method is inherited from HashSet class
        lhs.add("arpit");
        lhs.add("amit");
        lhs.add("amit");
        lhs.add("vikesh");
        
        Iterator itr=lhs.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        
}    
}
