
import java.util.Scanner;
 
class array4
 {
     int arr[][];
     int rows;
     int columns;
     
     
     public array4(int noofrows,int noofcolumns)
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
    
    public void matrixtranspose(array4 object1)
    {
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++)
            {
            arr[i][j]=object1.arr[j][i];
            }
        }
    }
 }




public class matrixtranspose {
    
    public static void main(String args[])
    {
        array4 obj1=new array4(3,3);
        System.out.println("matrix:");
        obj1.creatematrix();
        obj1.printmatrix();
        
        array4 obj2=new array4(3,3);
        System.out.println("matrix transpose:");
        obj2.matrixtranspose(obj1);
        obj2.printmatrix();
    }
    
}
