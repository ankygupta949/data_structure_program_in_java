/*
 * To change[this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ankit gupta
 */
public class sumofdigitsupto1digit {
    
    public int sum(int number)
    {
        int res=0,rem,res1=0;
        int len=String.valueOf(number).length();
        if(len>1)
        {
          
            for(int i=0;i<len;i++)
            {
           rem=number%10;
           res=res + rem;
           number=number/10;
            }
          
        }
        int len1=String.valueOf(res).length();
        if(len1>1)
         {
           
            res1= sum(res);
        }
        
        else{
          return res;  
        }
        return res1;
    }
            
            
    
    
    public static void main(String args[])
    {
        sumofdigitsupto1digit obj=new sumofdigitsupto1digit();
        int result=obj.sum(12345);
        System.out.println(result);
    }
    
}
