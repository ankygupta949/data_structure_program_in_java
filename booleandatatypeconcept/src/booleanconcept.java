/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ankit gupta
 */
public class booleanconcept {
    


   static int a=2;
   static boolean check(){
       return (a==1);
   }
   

    public static void main(String[] args) 
    {
        if(check()){
            
            System.out.println("ok");
        }
        else
        {
            System.out.println("not ok");
        }
        
        boolean b=check();
            System.out.println(b);
    }
}  
    

