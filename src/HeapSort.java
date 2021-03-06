// Java program for implementation of Heap Sort 
public class HeapSort 
{ 
	public void sort(Interval arr[]) 
	{ 
		int n = arr.length; 

		// Build heap (rearrange array) 
		for (int i = n / 2 - 1; i >= 0; i--) 
			heapify(arr, n, i); 

		// One by one extract an element from heap 
		for (int i=n-1; i>=0; i--) 
		{ 
			// Move current root to end 
			Interval temp = arr[0]; 
			arr[0] = arr[i];  // Using swapped objects 
			arr[i] = temp; 

			// call max heapify on the reduced heap 
			heapify(arr, i, 0); 
		} 
	} 

	// To heapify a subtree rooted with node i which is 
	// an index in arr[]. n is size of heap 
	void heapify(Interval arr[], int n, int i) 
	{ 
		int largest = i; // Initialize largest as root 
		int l = 2*i + 1; // left = 2*i + 1 
		int r = 2*i + 2; // right = 2*i + 2 

		// If left child is larger than root 
		if (l < n && arr[l].getEnd() > arr[largest].getEnd()) 
			largest = l; 

		// If right child is larger than largest so far 
		if (r < n && arr[r].getEnd() > arr[largest].getEnd()) 
			largest = r; 

		// If largest is not root 
		if (largest != i) 
		{ 
			Interval swap = arr[i]; 
			arr[i] = arr[largest];
			arr[largest]= swap; // Swapping based on objects, unsure that works 

			// Recursively heapify the affected sub-tree 
			heapify(arr, n, largest); 
		} 
	} 

	/* A utility function to print array of size n */
	static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 

	
	
} 
