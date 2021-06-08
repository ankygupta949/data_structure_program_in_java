
/* this program taken from a comment on the page(Remove all duplicates from a given string) of geeksforgeeks site*/

 public class removeduplicates {
	public static void main(String[] args) {
		String s = "geeksforgeeks hello";
		String res = "";
		int count[] = new int[256];
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i)]++; /* value at index(s.charAt(i)) in array is incremented by 1*/
                        
                        
			if (count[s.charAt(i)] > 0 && count[s.charAt(i)] <= 1)
				res += s.charAt(i);
		}
		System.out.println(res);
	}
} 
 