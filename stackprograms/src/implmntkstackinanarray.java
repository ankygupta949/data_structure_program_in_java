/*Method 2 (A space efficient implementation)
The idea is to use two extra arrays for efficient implementation of k stacks in an array. 

Following are the two extra arrays are used:
1) top[]: This is of size k and stores indexes of top elements in all stacks.
2) next[]: This is of size n and stores indexes of next item for the items in array arr[]. Here arr[] is actual array that stores k stacks.
Together with k stacks, a stack of free slots in arr[] is also maintained. (The top of this stack is stored in a variable ‘free’. ignore)

All entries in top[] are initialized as -1 to indicate that all stacks are empty. All entries next[i] are initialized as i+1 because all slots are free initially and pointing to next slot. Top of free stack, ‘free’ is initialized as 0.
  
 */
public class implmntkstackinanarray {
    
    int arr[];
    int top[];
    int next[];
    int k,n,free;  //k is number of stack,n is length of array,free is an index of array at which new item will be insert
    
    implmntkstackinanarray(int totalstack,int len)
    {
        arr=new int[len];
        top=new int[totalstack];
        next=new int[len];
        for(int j=0;j<k;j++)
            top[j]=-1;
        for(int i=0;i<len-1;i++)
        {
            next[i]=i+1;
        }
        arr[len-1]=-1;
        free=0;
    }
    
    public void push(int item,int numstack) //numstack is number of stack in which item is to be push
    {
      int i=free;  //free is an index of array at which new item will be insert
      free=next[i]; // now free is changed(increment),which will be used next time to insert an item
      next[i]=top[numstack];//now next is changed and stores the index of top item of numstack
      top[numstack]=i;  //actually here i is the index of array arr and i is stored in top[numstack] now see next line    
      
      arr[i]=item;//that means top item of numstack  is stored at index(same as value of top[numstack]) of array
    }
    
    public int pop(int numstack)
    {
       int i=top[numstack]; 
       top[numstack]=next[i];
       next[i]=free;
       free=i;
       
       return arr[i];
       
    }
     boolean isFull(){
        return free==-1;
    }
    
    boolean isEmpty(int kn){
        return top[kn]==-1;
    }
    
	public static void main(String args[]){
    // Let us create 3 stacks in an array of size 10
    int k = 3, n = 10;
    implmntkstackinanarray ks=new implmntkstackinanarray(k, n);
 
    // Let us put some items in stack number 2
    ks.push(15, 2);
    ks.push(45, 2);
 
    // Let us put some items in stack number 1
    ks.push(17, 1);
    ks.push(49, 1);
    ks.push(39, 1);
 
    // Let us put some items in stack number 0
    ks.push(11, 0);
    ks.push(9, 0);
    ks.push(7, 0);
 
    System.out.println("Popped element from stack 2 is "+ks.pop(2));
    System.out.println("Popped element from stack 1 is "+ks.pop(1));
    System.out.println("Popped element from stack 0 is "+ks.pop(0));
	}
}
