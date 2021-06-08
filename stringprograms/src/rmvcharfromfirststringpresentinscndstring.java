
public class rmvcharfromfirststringpresentinscndstring {
    //there are two method to do this:
    //method1
    public String resultmethod1(String first,String second)
    {
        String res="";
        int arr[] = new int[256];
        int len1=first.length();
        int len2=second.length();
        for(int i=0;i<len2;i++){
            arr[second.charAt(i)]++;
        }
        for(int j=0;j<len1;j++)
        {
            if(arr[first.charAt(j)]==0)
            {
                res=res + first.charAt(j);
            }
        }
        return res;
    }
    
    //method2
    public String resultmethod2(String first,String second){
        char farr[]=first.toCharArray();
        char sarr[]=second.toCharArray();
        String res="";
        for(int i=0;i<sarr.length;i++){
            for(int j=0;j<farr.length;j++){
               if(sarr[i]==farr[j]){
                   farr[j]='*';  //here we used star to show as a null
               } 
            }
        }
        for(char c:farr){
            if(c!='*')
                res=res +c;
        }
        return res;
    }
    
    public static void main(String args[])
    {
      String str1="hello ankit";
      String str2="hell";
      rmvcharfromfirststringpresentinscndstring obj = new rmvcharfromfirststringpresentinscndstring();
      //calling method1
      System.out.println("method1:");
      String resultstring1=obj.resultmethod1(str1,str2);
      System.out.println("first string:"+str1);
      System.out.println("second string:"+str2);
      System.out.println("after Remove characters from the first string which are present in the second string :"+resultstring1);
      
      
      
      //calling method2
      System.out.println("method2:");
      String resultstring2=obj.resultmethod2(str1,str2);
      System.out.println("first string:"+str1);
      System.out.println("second string:"+str2);
      System.out.println("after Remove characters from the first string which are present in the second string :"+resultstring2);
      
    }
    
    
}
