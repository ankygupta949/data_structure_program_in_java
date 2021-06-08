/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ankit gupta
 */
public class maximumoccurcharctrinstring {
    
    public char maxoccurcharctr(String str)
    {
        int max=-1;
        char result=' ';
        int len=str.length();
       int arr[] = new int[256]; 
       for(int i=0;i<len;i++)
       { 
   arr[str.charAt(i)]++;  //here we use character of str as index of arr, therefore here sequence of index of arr is g,e,k,s,f,o,r
       } 
      
       for(int j=0;j<len;j++)
       {
           if(arr[str.charAt(j)]>max)
           {
              max=arr[str.charAt(j)] ;
              result=str.charAt(j);
           }
           
       }
       return result;
    
    }
 
    
    public static void main(String args[])
    {
        String str1="geeks for geeks";
        maximumoccurcharctrinstring  obj = new maximumoccurcharctrinstring ();
        char res=obj.maxoccurcharctr(str1);
        System.out.println("string is:"+str1);
    System.out.println("maximum occuring character in string:"+res);
    }
}
