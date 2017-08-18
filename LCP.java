import java.lang.String;
import java.lang.Integer;
// Longest Common Prefix using Binary Search 

public class LCP{
	private boolean allContainsPrefix(String[] arr, int len){
		String str = arr[0].substring(0, len);
		for (int i=0; i<arr.length; i++){
			if(!arr[i].startsWith(str))
				return false;
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
		while(low <= high){
			// Same as (low+high)/2, but avoids overflow for large low and high
			int mid = low + (high-low)/2;
			if(allContainsPrefix(arr, mid)){
				low = mid+1;
			}else{
				high = mid-1;
			}

		}
		return arr[0].substring(0, (low+high)/2);
	}
	public static void main(String[] args){
		String[] arr = {"aerospace", "aerodynamics", "aeroplane", "aeroengineering", "aeol"};
		LCP lcp = new LCP();
		String ans = lcp.commonPrefix(arr);
		System.out.println("Answer is: " + ans);
	}
}