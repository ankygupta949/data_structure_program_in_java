import java.util.Scanner;
 
class array1
 {
     int arr[][];
     int rows;
     int columns;
     
     
     public array1(int noofrows,int noofcolumns)
     {
         rows=noofrows;
         columns=noofcolumns;
         arr=new int[rows][columns];
        
         
     }
     
    public void creatematrix()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<rows;i++)  //i is used for row
        {
            for(int j=0;j<columns;j++)  //j is used for column
            {
                System.out.print("enter value at arr["+i+"]["+j+"]:");
               arr[i][j]=sc.nextInt(); 
            }
        }
    }
    
    public void printmatrix()
    {
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++)
            {
               System.out.print(arr[i][j]+" ");
            }
        System.out.println();
        }
    }
    
    public void matrixadd(array1 object1,array1 object2)
    {
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++)
            {
               arr[i][j]=object1.arr[i][j]+object2.arr[i][j]; 
            }
        }
    }
 }


public class matrixaddition {
    
    public static void main(String args[])
    {
     
        array1 obj1 = new array1(3,3);   //create 2d array or matrix of 3*3
        
        System.out.println("matrix1");
        obj1.creatematrix();
       obj1.printmatrix();
        
        array1 obj2 = new array1(3,3);    //create 2d array or matrix of 3*3
           System.out.println("matrix2");
        obj2.creatematrix();
    obj2.printmatrix();
        
        array1 res = new array1(3,3);    //create 2d array or matrix of 3*3
        
        
        System.out.println("resultmatrix");
        res.matrixadd(obj1, obj2);
        res.printmatrix();
        
        
    }
}
