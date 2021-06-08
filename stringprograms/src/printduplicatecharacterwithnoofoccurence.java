

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class printduplicatecharacterwithnoofoccurence {

   //first method to do it 
    public static void printduplicatecharusinginbuiltmethods(String str1)
    {
        HashMap<Character,Integer> hm= new HashMap<Character,Integer>();
        char arr[]=str1.toCharArray();
        for(char ch:arr){
            if(!hm.containsKey(ch))
                hm.put(ch,1);
            else
           hm.put(ch,hm.get(ch)+1);
        }
        System.out.println(hm);
        Set<Character> s=hm.keySet();
        for(char c:s){
         if(hm.get(c)>1)
            System.out.println(c+":"+hm.get(c));
        }
        
    }
    
    //second method to do it
    public static void printduplicatecharacter(String str2){
        char arr[]=str2.toCharArray();
        
         for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[j]=' ';
                    count++;
                }
                
            }
            
            if(count>1 && arr[i]!=' ')
                System.out.println("no.of occurs of "+arr[i]+":"+count);  
              
        }
        
    }
    
    //third method to do it
    public static void printdupsusingnewarray(String s3){
        char arr[]=s3.toCharArray();
        int count[] = new int[256];
        for(char c:arr)
            count[c]++; //in count[] array, we used the character as an index instead of integer
        for(char c:arr)
            if(count[c]>1){
                System.out.println("no.of occurs of "+c+":"+count[c]);
            count[c]=0; //we assined 0 to count[c](here c is a duplicate character) to prevent the print of (this character c and its no. of occurs) again 
            }
        
    }
    
    public static void main(String args[]){
        String s1="ankita";
        System.out.println("first method :");
        printduplicatecharusinginbuiltmethods(s1);
        
        System.out.println("second method :");
        printduplicatecharacter(s1);
    
    System.out.println("third method:");
    printdupsusingnewarray(s1);
    }
    
}
