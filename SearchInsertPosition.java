public class SearchInsertPosition{
	public int searchInsert(int[] nums, int target){
		int low = 0, high = nums.length-1;
		while(low<=high){
			int mid = (low+high)/2;
			if(nums[mid] == target)
				return mid;
			else if(nums[mid] > target)
				high = mid-low;
			else
				low = mid+1;
		}
		return low; 
	}
	public static void main(String[] args){
		SearchInsertPosition sip = new SearchInsertPosition();
		int index = sip.searchInsert(new int[]{1,4,5,6,13},7);
		System.out.println(index);
	}
}