
class array7{
    int arr[][];
    int rows;
    int columns;
    
    array7(int noofrows,int noofcolumns){
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
    
    public void sumofelementsabovethediagonal(){
        int sum=0;
        for(int i=0;i<rows;i++)
        for(int j=i+1;j<columns;j++)
        sum=sum+arr[i][j];
        System.out.println("sum of elements above the diagonal:"+sum);
    }
     
    public void sumofelementsbelowthediagonal(){
        int sum=0;
        for(int i=0;i<rows;i++)
            for(int j=i-1;j>=0;j--)
        sum=sum+arr[i][j];
        System.out.println("sum of elements below the diagonal:"+sum);
    }
    
}


public class printsumofelementsaboveandbelowthediagonals {
    public static void main(String args[]){
    array7 obj = new array7(3,3);
    obj.creatematrix();
    obj.printmatrix();
    obj.sumofelementsabovethediagonal();
    
    obj.printmatrix();
    obj.sumofelementsbelowthediagonal();
            }
}
