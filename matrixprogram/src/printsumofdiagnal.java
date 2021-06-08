
import java.util.Scanner;
 
class array5
 {
     int arr[][];
     int rows;
     int columns;
     
     
     public array5(int noofrows,int noofcolumns)
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
    
    public void lefttorightdiagonalsum()
    {
     
        int sum = 0;
        for(int i=0,j=0;i<rows && j<columns;i++,j++)
        {
            sum=sum +arr[i][j];
        }
        System.out.println("sum of left to right diagonal:"+sum);
        
 }
    
     public void righttoleftdiagonalsum()
    {
        
    int sum = 0;
        for(int i=0,j=columns-1;i<rows && j>=0;i++,j--)
        {
            sum=sum +arr[i][j];
        }
        System.out.println("sum of right to left diagonal:"+sum);
            
 }

}

public class printsumofdiagnal {
    
    public static void main(String args[])
    {
        array5 obj1 = new array5(3,3);
        System.out.println("matrix");
        obj1.creatematrix();
        obj1.printmatrix();
        obj1.lefttorightdiagonalsum();
        obj1.righttoleftdiagonalsum();
    }
    
}
