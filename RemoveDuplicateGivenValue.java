public class RemoveDuplicateGivenValue{
	public int removeElement(int[] nums, int val){
		int b = 0;
		int c = 0;
		for(int i=0; i<nums.length; i++){
			if(nums[i] != val){
				nums[b] = nums[i];
				b++;
				c++;
			}
		} 
		for(int j=0; j<b; j++){
			System.out.print(nums[j] + " ");
		}
		return c;
	}
	public static void main(String[] args){
		RemoveDuplicateGivenValue rdgv = new RemoveDuplicateGivenValue();
		int ans = rdgv.removeElement(new int[]{1,1,3,5,6,5}, 5);
		System.out.println("Ans is: " + ans);
	}
}