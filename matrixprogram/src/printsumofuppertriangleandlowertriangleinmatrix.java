
class array6{
    int arr[][];
    int rows;
    int columns;
    
    array6(int noofrows,int noofcolumns){
        rows=noofrows;
        columns=noofcolumns;
        arr=new int[rows][columns];
        }
    
    
    public void creatematrix(){
        
        for(int i=0;i<rows;i++)
            for(int j=0;j<columns;j++)
            {
                System.out.print("enter value at arr["+i+"]["+j+"]:");
                arr[i][j]= new java.util.Scanner(System.in).nextInt();
            }
        
    }
    
    public void printmatrix(){
        for(int i=0;i<rows;i++){
         
            for(int j=0;j<columns;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public void sumofuppertriangle(){
        int sum=0;
        for(int i=0;i<rows;i++)
        for(int j=i;j<columns;j++)
        sum=sum+arr[i][j];
        System.out.println("sumofuppertriangle:"+sum);
    }
     
    public void sumoflowertriangle(){
        int sum=0;
        for(int i=0;i<rows;i++)
            for(int j=i;j>=0;j--)
        sum=sum+arr[i][j];
        System.out.println("sumoflowertriangle:"+sum);
    }
    
}


public class printsumofuppertriangleandlowertriangleinmatrix {
    
    public static void main(String args[])
    {
        array6 obj = new array6(3,3);
        obj.creatematrix();
        obj.printmatrix();
        obj.sumofuppertriangle();
        
        obj.printmatrix();
        obj.sumoflowertriangle();
        
    }
    
}
