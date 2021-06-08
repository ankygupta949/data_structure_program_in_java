/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ankit gupta
 */

public class returnpairofelementsinarraywhosesumequaltogivensum {
   final static int max=100;
    
      static void  check(int arr[],int sum)
    {
      
        /*the difference between boolean and Boolean is: boolean variable can store true or false(by default)  &  Boolean variable can store true or false or null(by default)*/
        /* if we create Boolean array below ,null value generate the error  */
        boolean binmap[] = new boolean[max]; /* by default this is array of false as {false,false,false,false,......,false}  */
        for(int i=0;i<arr.length;i++)
        {
           int temp=sum-arr[i];
           if(temp>0 && binmap[temp]){ /* in condition , we can use binmap[temp] which means binmap[temp]==true */
               System.out.println("two numbers in given array whose sum is equal to given sum are :"+temp+ " and " +arr[i]);
           }
           binmap[arr[i]]=true;
        }
    }
    
    
    public static void main(String args[])
    {
        int arr1[]={10,20,30,40,5,25 };
        int sum1=30;
        check(arr1,sum1);
        System.out.println(7 & 12);

    }



    
}
