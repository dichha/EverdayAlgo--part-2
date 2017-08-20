public class RemoveDuplicatesSorted{
	public int removeDuplicates(int[] arr){
		if(arr.length == 0)
			return 0;
		int b = 0;
		arr[b] = arr[0];
		for(int i=1; i<arr.length; i++){
			if(arr[b] != arr[i]){
				b++;
				arr[b] = arr[i];
			}
		}
		for (int j=0; j<=b; j++)
			System.out.print(arr[j] + " ");
		return b+1;
	}
	public static void main(String[] args){
		RemoveDuplicatesSorted rds = new RemoveDuplicatesSorted();
		int ans = rds.removeDuplicates(new int[]{1,1,2,2,3,3,55, 95});
		System.out.println("Length of the array is: " + ans);
	}
}