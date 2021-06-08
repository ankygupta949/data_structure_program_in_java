import java.util.ArrayList; // ArrayList class uses a dynamic array for storing the elements.It extends AbstractList class and implements List interface(that extends the collection interface).
import java.util.ListIterator; // ListIterator Interface(extends the Iterator interface) is used to traverse the element in backward and forward direction.       



public class listiteratorinterfaceuses {
    
     public static void main(String args[])
    {
       /* object of ArrayList class is arraylist */
        ArrayList<String> al = new ArrayList<String>(); //creating object of ArrayList class(means creating arraylist),here al is arraylist & String is type of values stored in al(arraylist)//
        al.add("ankit");  // add() method is inherited from collection interface & defined in AbstractList class(that implements the List interface first)
        al.add("arpit");
        al.add("amit");
        al.add("vikesh");
        
        System.out.println("traversing elements in forward direction..."); 
        ListIterator<String> litr=al.listIterator();
        while(litr.hasNext())
            System.out.println(litr.next());
        
        System.out.println("traversing elements in backward direction...");
        while(litr.hasPrevious())
            System.out.println(litr.previous());
        
      
        
    }

    
}
