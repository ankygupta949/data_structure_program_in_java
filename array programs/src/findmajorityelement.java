
/* Majority Element: A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element).   */


public class findmajorityelement {
    final static int x=100;
    
    
     
   /* 1st way*/ 
    static int majorityelement(int arr[])
    {
      int n=arr.length;
        int count[]=new int[x];
        for(int i=0;i<n;i++)
        {
            count[arr[i]]++;
        }
        
        for(int i=0;i<n;i++)
        {
            if(count[arr[i] ]>n/2)
                    {
                      return arr[i];  
                    }

        }
        
        return 0;
    }
    
    /*  2nd way*/
    
  /*   static void printMajority(int a[]) 
    {
        // Find the candidate for Majority
        int size=a.length;
        int cand = findCandidate(a, size);
 
        // Print the candidate if it is Majority
        if (isMajority(a, size, cand))
            System.out.println("majority element: " + cand + " ");
        else
            System.out.println("No Majority Element");
    }
 
    // Function to find the candidate for Majority 
   static int findCandidate(int a[], int size) 
    {
        int maj_index = 0, count = 1;
        int i;
        for (i = 1; i < size; i++) 
        {
            if (a[maj_index] == a[i])
                count++;
            else
                count--;
            if (count == 0)
            {
                maj_index = i;
                count = 1;
            }
        }
        return a[maj_index];
    }
 
   //  Function to check if the candidate occurs more than n/2 times 
    static boolean isMajority(int a[], int size, int cand) 
    {
        int i, count = 0;
        for (i = 0; i < size; i++) 
        {
            if (a[i] == cand)
                count++;
        }
        if (count > size / 2) 
            return true;
        else
            return false;
    } */
      
   
    public static void main(String args[])
    {
        int arr1[]={1,5,2,5,2,5,5,1,5,1,5 };
       
        
        
       System.out.println("majority element is: "+majorityelement(arr1));
       /* or */
       /* printMajority(arr1); // 2nd way*/
    }
    
}
