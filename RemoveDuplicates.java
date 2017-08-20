public class RemoveDuplicates{
	public int removeDuplicates(int[] arrayWithDuplicates){
		int noOfUniqueElements = arrayWithDuplicates.length;

		for(int i=0; i<noOfUniqueElements; i++){			
			for(int j=i+1; j<noOfUniqueElements; j++){
				if(arrayWithDuplicates[i] == arrayWithDuplicates[j]){
					arrayWithDuplicates[j] = arrayWithDuplicates[noOfUniqueElements-1];	
					noOfUniqueElements--;
					j--;
				}
			}
		}
		return noOfUniqueElements; 
	}
	public static void main(String[] args){
		RemoveDuplicates rd = new RemoveDuplicates();
		int num = rd.removeDuplicates(new int[]{3, 4, 2, 4, 9, 2});
		int num1 = rd.removeDuplicates(new int[]{1, 1, 1, 1});
		System.out.println("Num is: " + num);
		System.out.println("Num is: " + num1);
	}
}