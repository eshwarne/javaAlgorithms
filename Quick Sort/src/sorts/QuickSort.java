package sorts;

public class QuickSort {
	public static int partition(int[] Array,int start,int end) {
		int pivotIndex = start;
		int pivotElement=Array[end];
		for(int i=start;i<=(end-1);i++) {
			if(Array[i]<pivotElement) {
				int temp=Array[pivotIndex];
				Array[pivotIndex]=Array[i];
				Array[i]=temp;
				pivotIndex++;
			}
		}
		int temp=Array[pivotIndex];
		Array[pivotIndex]=Array[end];
		Array[end]=temp;
		return pivotIndex;
	}
	public static void quickSort(int[] Array, int start, int end) {
		
	}
	public static void main(String cliArgs[]) {
		int[] Array= {2,5,4,2,8,7,10,5};
	}
}
