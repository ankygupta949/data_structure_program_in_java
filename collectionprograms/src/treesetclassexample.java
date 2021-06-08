import java.util.TreeSet;   //contains unique elements(& in ascending order) only like HashSet. The TreeSet class extends AbstractSet class and implements NavigableSet interface that extends the SortedSet interface(that extends Set Interface).
import java.util.Iterator;

public class treesetclassexample {
    
  public static void main(String args[]){
      
       /* object of TreeSet class is treeset */
    TreeSet<String> tr = new TreeSet<String>(); //creating object of TreeSet class(means creating treeset),here tr is treeset & String is type of values stored in tr(treeset)//
    tr.add("ankit");  // add() method is inherited from collection interface & defined in AbstractSet class(that implements the Set interface first)
    tr.add("arpit");
    tr.add("amit");
    tr.add("amit");
    tr.add("vikesh");
      
    
    Iterator itr1 =tr.iterator(); //iterator() method is inherited from collection interface & defined in AbstractSet class  (this method return the iterator)
        while(itr1.hasNext())
            System.out.println(itr1.next());
   
  }  
    
}
