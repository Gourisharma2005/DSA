package sorting;

public class InsertionSort {
    public static void main(String[] args) {
    	int[] arr = {4, 3, 5, 1, 2};
        System.out.println("Before Sorting:");
        printArray(arr);
        insertionSort(arr);
        System.out.println("\nAfter Sorting:");
        printArray(arr);
	}
    public static void insertionSort(int[] arr) {
    	int n = arr.length;
    	for(int i=1;i<n;i++) {//It starts from i = 1 (since we assume arr[0] is already sorted)
    		int j=i;
    		while(j>0 && arr[j]<arr[j-1]) {
    			int temp = arr[j];
    			arr[j] = arr[j-1];
    			arr[j-1] = temp;
    			j--;
    		}
    	}
    }
    public static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.print(a+" ");
        }
    }
}
