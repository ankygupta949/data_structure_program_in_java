import java.util.ArrayList; // ArrayList class uses a dynamic array for storing the elements.It extends AbstractList class and implements List interface(that extends the collection interface).
import java.util.Iterator; // ListIterator Interface is used to traverse the element in forward direction only.       
public class arraylistclassexample {
    
    public static void main(String args[])
    {
       /* object of ArrayList class is arraylist */
        ArrayList<String> al = new ArrayList<String>(); //creating object of ArrayList class(means creating arraylist),here al is arraylist & String is type of values stored in al(arraylist)//
        al.add("ankit");  // add() method is inherited from collection interface & defined in AbstractList class(that implements the List interface first)
        al.add("arpit");
        al.add("amit");
        al.add("vikesh");
        
        
      
        System.out.println(" first method to print the elements by using iterator:");
        Iterator itr =al.iterator(); //iterator() method is inherited from collection interface & defined in AbstractList class (this method return the iterator)
        while(itr.hasNext())
            System.out.println(itr.next());
        
        
        System.out.println(" second method to print the elements by using foreach loop");
        for(String str:al)
            System.out.println(str);
        
        
        System.out.println("size of arraylist:"+al.size());
                
    }
}
