import java.util.LinkedHashMap;  //it extends the HashMap class and implements the Map interface
import java.util.Map;


public class linkedhashmapclassexample {
    
  public static void main(String args[]){
        
        /*object of LinkedHashMap class is linkedhashmap & Linkedhashmap contains values based on the key (ex-: (key,value),this set is called entry set)*/
        // It is same as hashmap instead maintains insertion order. 
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer,String>(); //creating object of LinkedHashMap class(means creating linkedhashmap),here lhm is linkedhashmap , Integer is type of keys & String is type of values stored in lhm(linkedhashmap)//
        
        lhm.put(1,"ankit");  // put() method is inherited from Map interface & defined in AbstractMap class(that implements the Map interface first) 
        lhm.put(2,"arpit");
        lhm.put(3,"kapil");
        lhm.put(4,"vikesh");
        
        /*Entry is the nestedinterface of Map. So we will be accessed it by Map.Entry name. It provides methods to get key and value.
Methods of Entry interface:

    public Object getKey(): is used to obtain key.
    public Object getValue():is used to obtain value.

*/
        for(Map.Entry m:lhm.entrySet())  //entryset() method is inherited from Map interface & defined in AbstractMap class  (this method returns the Set view containing all the keys and values.)
            System.out.println(m.getKey()+ " "+m.getValue()); 
    }  
}
