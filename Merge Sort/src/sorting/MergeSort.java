/*
 * Merge sort has a complexity of O(nlogn) at its worst case
 * Here is a java implementation of the Merge sort algorithm with proper steps*/
package sorting;
public class MergeSort {
	/*
	 * merge function to merge arrays at each level into a new sorted array, given the Arrays that are merged are sorted too
	 * The complexity of this function O(n)*/
	static void merge(int[] l,int[] r,int[] array) {
		int i=0;
		int j=0;
		int k=0;
		while(i<l.length && j<r.length) {
			if(l[i]<=r[j]) {
				array[k]=l[i];
				i++;
				k++;
			}
			else if(r[j]<l[i]) {
				array[k]=r[j];
				j++;
				k++;
			}
		}
		while(i<l.length) {
			array[k]=l[i];
			k++;
			i++;
		}
		while(j<r.length) {
			array[k]=r[j];
			k++;
			j++;
		}
		
	}
	/*
	 * The segmentation and recursion part*/
	static void mergeSort(int[] Array) {
		if(Array.length<=1) {
			return;
		}
		int[] left;
		int[] right;
		int n=(int)Math.floor(Array.length/2);
		left=new int[n];
		right=new int[Array.length-n];
		int k=0;
		for(int i=0;i<n;i++) {
			left[i]=Array[i];
			k++;
		}
		for(int j=0;j<Array.length-n;j++) {
			right[j]=Array[k];
			k++;
		}
			mergeSort(left); // goes till the left leaf and returns
			mergeSort(right);// goes to the right leaf and returns
			merge(left,right,Array); // the leaves are then merged into a sorted array
	}
	public static void main(String cliArgs[]) {
		int[] Array1= {2,5,7};
		int[] Array2= {1,2,2};
		int[] Array= {1,7,2,2,5,2,2,0};
		System.out.println("HELLO");
		//to showcase the concept of how a merge function works
//		merge(Array1,Array2,Array);
//		System.out.println("HELLO");
//		for(int ele:Array) {
//			System.out.println(ele);
//		}
		mergeSort(Array);
		for(int ele:Array) {
			System.out.println(ele);
		}
	}
}
