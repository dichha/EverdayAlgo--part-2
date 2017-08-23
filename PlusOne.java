public class PlusOne{
	public int[] plusOne(int[] digits){
		int n = digits.length; 
		for(int i=n-1; i>=0; i--){
			if(digits[i] < 9){
				digits[i]++;
				return digits;
			}else{
				digits[i] = 0;
			}	
		}
		int[] newNumber = new int[n+1];
		newNumber[0] = 1;
		return newNumber; 
	}
	public static void main(String[] args){
		PlusOne po = new PlusOne(); 
		int[] arr = po.plusOne(new int[]{1,2,3,4,5,6,7,8,9});
		for(int i: arr)
			System.out.print(i + " ");
	}
}