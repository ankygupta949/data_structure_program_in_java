/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ankit gupta
 */
public class reversestring {
    
    public String rev(String str)
    {
        System.out.println("input string:"+str);
        int n=str.length();
       String str1="";
        for(int i=0;i<n;i++){
            str1=str1 + str.charAt(n-1-i); 
        }
       
    return str1;
    }
    
    public static void main(String args[])
    {
        reversestring obj = new reversestring();
        String result=obj.rev("hello my name is ankit");
        System.out.println("reversed string:"+result);
    }
}
