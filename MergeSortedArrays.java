public class MergeSortedArrays{
	public MergeSortedArrays(){}
	public int[] mergeArrays(int[] arr1, int m, int[] arr2, int n){

		int i = m-1;
		int j = n-1;
		int k = m+n-1; 

		while (i>-1 && j > -1){
			arr1[k--] = (arr1[i] > arr2[j]) ?  arr1[i--] : arr2[j--];

		}	
		while(j > -1){
			arr1[k--] = arr2[j--];
		}
		return arr1;
	}

	public static void main(String[] args){
		MergeSortedArrays msa = new MergeSortedArrays();
		int[] arr1 = {-99, 1, 3, 33, 55, 67, 84};
		int[] arr2 = {0, 4, 10, 12, 49, 77, 200, 202};
		
		int total = arr1.length + arr2.length; 
		int[] biggerArr = new int[total]; 
		for (int i=0; i < total; i++){
			if(i >= arr1.length)
				biggerArr[i] = 0;
			else
				biggerArr[i] = arr1[i];
		}
		int[] sa = msa.mergeArrays(biggerArr, arr1.length, arr2, arr2.length);
		for(int i: sa)
			System.out.print(i + " "); 
		System.out.println();
	}
}