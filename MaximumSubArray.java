public class MaximumSubArray{
	MaximumSubArray(){};
	public int maxSubArray(int[] nums){
		int maxSoFar = nums[0], maxEndingHere = nums[0];
		for(int i=1; i<nums.length; i++){
			maxEndingHere = Math.max(maxEndingHere + nums[i], nums[i]);
			maxSoFar = Math.max(maxEndingHere, maxSoFar);
		}
		return maxSoFar;
	}
	public static void main(String[] args){
		MaximumSubArray msa = new MaximumSubArray();
		int ans = msa.maxSubArray(new int[]{-1, 3, 4, -3, -100, 1, 4, 0});
		System.out.println("Maximum Subarray's sum is: " + ans);
	}
}