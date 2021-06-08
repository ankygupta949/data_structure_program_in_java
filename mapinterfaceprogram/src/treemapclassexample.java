import java.util.TreeMap;  //it extends AbstractMap class and implements NavigableMap interface that extends the SortedMap interface(that extends Map interface).
import java.util.Map;


public class treemapclassexample {
    
    public static void main(String args[]){
        
        /*object of TreeMap class is treemap & treemap contains values based on the key (ex-: (key,value),this set is called entry set)*/
        // It is same as hashmap instead maintains ascending order(according to keys).
        TreeMap<Integer,String> tm = new TreeMap<Integer,String>(); //creating object of TreeMap class(means creating treemap),here tm is treemap , Integer is type of keys & String is type of values stored in tm(treemap)//
        
        tm.put(1,"ankit");  // put() method is inherited from Map interface & defined in AbstractMap class(that implements the Map interface first) 
        tm.put(3,"kapil");
        tm.put(2,"arpit");
        tm.put(4,"vikesh");
        
        /*Entry is the nestedinterface of Map. So we will be accessed it by Map.Entry name. It provides methods to get key and value.
Methods of Entry interface:

    public Object getKey(): is used to obtain key.
    public Object getValue():is used to obtain value.

*/
        for(Map.Entry m:tm.entrySet())  //entryset() method is inherited from Map interface & defined in AbstractMap class  (this method returns the Set view containing all the keys and values.)
            System.out.println(m.getKey()+ " "+m.getValue()); 
    }
    
}
