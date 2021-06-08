import java.util.Hashtable; //it extends Dictionary class and implements the Map interface
import java.util.Map;


public class hashtableclassexample {
    public static void main(String args[]){  
   /*  it mantain the order in descendending order(according to keys)*/
  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
  
  hm.put(1,"Amit");  
  hm.put(2,"Ravi");  
  hm.put(5, "ankit");
  hm.put(3,"Vijay");  
  hm.put(4,"Rahul");  
  
  for(Map.Entry m:hm.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
    
}
