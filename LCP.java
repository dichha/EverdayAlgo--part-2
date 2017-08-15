import java.lang.String;
import java.lang.Integer;
// Longest Common Prefix using Binary Search 

public class LCP{
	private boolean allContainsPrefix(String[] arr, String str,  int start, int end){
		for (int i=0; i<arr.length; i++){
			for(int j=start; j<=end; j++){
				if(arr[i].charAt(j) != str.charAt(j)){	
					return false;
				}
			}
		}
		return true; 
	}
	private Integer findMinLength(String[] arr){
		int min = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++){
			if(arr[i].length() < min){
				min = arr[i].length();
			
			}
		}
		return min;
	}
	private String commonPrefix(String[] arr){
		int len = findMinLength(arr);
		int low = 0, high = len;

		String prefix = ""; 
		while(low <= high){
			// Same as (low+high)/2, but avoids overflow for large low and high
			int mid = low + (high-low)/2;
			if(allContainsPrefix(arr, arr[0], low, mid)){
				prefix = prefix + arr[0].substring(low, mid-low+1);
				low = mid+1;
			}else{
				high = mid-1;
			}

		}
		return prefix;
	}
	public static void main(String[] args){
		String[] arr = {"geeksforgeeks", "geeks", "geek", "geezer"};
		LCP lcp = new LCP();
		String ans = lcp.commonPrefix(arr);
		System.out.println("The longest common prefix is " + ans);
		
	}
}