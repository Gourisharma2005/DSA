package sorting;

public class BubbleSort {
	
   public static void main(String[] args) {
	int[] arr= {5,7,3,1,9,0};
	System.out.println("before sorting ");
	printArray(arr);
	bubbleSort(arr);
	System.out.println("\nafter sorting");
	printArray(arr);
}
   public static void bubbleSort(int[] arr) {
	   int n  = arr.length;
	   boolean swap;
	   for(int i = 0;i<n-1;i++) {
		   swap = false;
		   for(int j = 0;j<n-i-1;j++) {
			   if(arr[j]>arr[j+1]) {
				   int temp = arr[j];
				   arr[j] = arr[j+1];
				   arr[j+1] = temp;
				   swap = true;
			   }
		   }
		   if(!swap) return;
	   }
   }
   public static void printArray(int[] arr) {
   for(int a:arr) {
		System.out.print(a+" ");
	}
}
}
