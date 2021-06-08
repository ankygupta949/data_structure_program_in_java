import java.util.HashMap;  // HashMap class extends AbstractMap class and implements Map interface
import java.util.Map;

class hashmapclassexample {
    
    public static void main(String args[]){
        
        /*object of HashMap class is hashmap & hashmap contains values based on the key (ex-: (key,value),this set is called entry set)*/
        // hashmap maintains no order.
        HashMap<Integer,String> hm = new HashMap<Integer,String>(); //creating object of HashMap class(means creating hashmap),here hm is hashmap , Integer is type of keys & String is type of values stored in hm(hashmap)//
        
        hm.put(1,"ankit");  // put() method is inherited from Map interface & defined in AbstractMap class(that implements the Map interface first) 
        hm.put(2,"arpit");
        hm.put(3,"kapil");
        hm.put(4,"vikesh");
       
        
        /*Entry is the nestedinterface of Map. So we will be accessed it by Map.Entry name. It provides methods to get key and value.
Methods of Entry interface:

    public Object getKey(): is used to obtain key.
    public Object getValue():is used to obtain value.

*/
        for(Map.Entry m:hm.entrySet())  //entryset() method is inherited from Map interface & defined in AbstractMap class  (this method returns the Set view containing all the keys and values.)
            System.out.println(m.getKey()+ " "+m.getValue()); 
    
    
        System.out.println("2nd way to print see below");
        for(int i:hm.keySet()){
            System.out.println(i +" "+hm.get(i));
        }
    }
    
}
