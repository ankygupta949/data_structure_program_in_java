/* write a function to return the number of occurence of number1 in number2*/  


public class numberofoccurence {
    
    public static int totaloccurs(int num1,int num2)
    {
        int count=0;
       while(num2>0)
       {
          int rem=num2%10;
          if(rem==num1)
              count++;
          num2=num2/10;
       }
       
       return count;
    }
    
    public static void main(String args[])
    {
        int n2=1252896232;
        int n1=2;
        
        int result=totaloccurs(n1,n2);
        System.out.println("number1:"+n1);
        System.out.println("number2:"+n2);
        System.out.println("number of occurence of number1 in number2:"+result);
    }
    
}
