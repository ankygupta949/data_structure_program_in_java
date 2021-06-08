
import java.util.Scanner;
 
class array3
 {
     int arr[][];
     int rows;
     int columns;
     
     
     public array3(int noofrows,int noofcolumns)
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
//note:when we multiply two matrix then product matrix will have no. of rows(same as first matrix) and no. of columns(same as second matrix)
    
    public void matrixmultiply(array3 object1,array3 object2)
    {
        
        for(int i=0;i<object1.rows;i++)
        {
            for(int j=0;j<object2.columns;j++){
            
              for(int k=0;k<object1.columns;k++)  //columns in matrix1 must be equal to rows in matrix2
                {
            
               arr[i][j]=arr[i][j] + object1.arr[i][k] * object2.arr[k][j];
            
                }
            }
        }
    }
 }





public class matrixmultiplication {
    
   public static void main(String args[])
    {
    array3 obj1 = new array3(3,3);   //create 2d array or matrix of 3*3
        
        System.out.println("matrix1");
        obj1.creatematrix();
       obj1.printmatrix();
        
        array3 obj2 = new array3(3,3);    //create 2d array or matrix of 3*3
           System.out.println("matrix2");
        obj2.creatematrix();
    obj2.printmatrix();
        
        array3 res = new array3(obj1.rows,obj2.columns);    
        
        
        System.out.println("resultmatrix");
        res.matrixmultiply(obj1, obj2);
        res.printmatrix();
    
}
    
}