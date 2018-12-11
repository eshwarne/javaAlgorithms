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
		if(start>=end) {
			return;
		}
		int pivotIndex=partition(Array,start,end);
		quickSort(Array,start,pivotIndex-1);
		quickSort(Array,pivotIndex+1,Array.length-1);
	}
	public static void main(String cliArgs[]) {
		int[] Array= {2,11,4,2,8,7,10,5};
//		int pivotIndex=partition(Array,0,Array.length-1);
//		for(int ele:Array) {
//			System.out.print(ele+" ");
//		}
		quickSort(Array,0,Array.length-1);
		System.out.println();
		for(int ele:Array) {
			System.out.print(ele+" ");
		}
	}
}
