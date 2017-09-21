public class HeapSort{
	HeapSort(){}
	public void sort(int arr[]){
		int n = arr.length; 

		//Build heap (rearrange array)
		for(int i=n/2-1; i>=0; i--){
			heapify(arr, n, i);
		} 

		// One by one extract an element from heap
		for (int i=n-1; i>=0; i--){
			// move the current root to end; 
			int temp = arr[0]; 
			arr[0] = arr[i];
			arr[i] = temp; 
			System.out.println("Printing after partial sort of an array");

			for(int j: arr){
				System.out.print(j + " ");
			}
			System.out.println();

			// call max heapify on the reduced heap
			heapify(arr, i, 0);
		}

	}
	// To heapify a subtree rooted with node i which
	// is an index in arr. n is the size of heap.
	void heapify(int[] arr, int n, int i){
		int largest = i; //initialize largest as root
		int l = 2*i + 1; // left
		int r = 2*i + 2; // right

		if(l < n && arr[l] > arr[largest])
			largest = l;
		if (r < n && arr[r] > arr[largest])
			largest = r;

		if(largest != i){
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp; 

			//Recursively heapify the affected sub-tree
			heapify(arr, n, largest);
		}

	}
	// A utility function to print array of size n 
	static void printArray(int[] arr){
		for (int i: arr)
			System.out.print(i + " ");
	}

	
	public static void main(String[] args){
		int[] arr = {12, 11, 13, 5, 6, 7}; 
		int n = arr.length;
		HeapSort ob = new HeapSort();
		ob.sort(arr);
		printArray(arr);
	}
}