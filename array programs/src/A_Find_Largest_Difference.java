public class A_Find_Largest_Difference {

    public static void main(String[] args) {
        int[] arr = new int[]{5,100,-4,-98,2};
        System.out.println(new A_Find_Largest_Difference().getLargestDiff(arr));
    }

    public int getLargestDiff(int arr[]){
        int min_element = arr[0];
        int max_element = arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i] > max_element){
                max_element=arr[i];
            }
            if(arr[i] < min_element){
                min_element=arr[i];
            }
        }
        return max_element-min_element;
    }
}
