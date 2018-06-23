//Sort 1 to N by swapping adjacent elements
//Given an array A of size N consisting of elements 1 to N. A boolean array B consisting of N-1 elements indicates that if 
//B[i] is 1 then A[i] can be swapped with A[i+1]. Find if A can be sorted by swapping elements
import java.io.*;
import java.util.Arrays;
class SortOneToN{
	static boolean sortedAfterSwap(int[] arr1, boolean[] arr2, int n) {
		for (int i = 0; i < n - 1; i++) {
			if (arr1[i] > arr1[i + 1] && arr2[i] == true) {
				int temp = arr1[i];
				arr1[i] = arr1[i + 1];
				arr1[i + 1] = temp;
			}
		}

		for (int i = 0; i < n - 1; i++) {
			if (arr1[i] > arr1[i + 1])
				return false;
		}

		return true;

	}
	public static void main(String[] args){
		int A[] = { 1, 2, 5, 3, 4, 6 };
		boolean B[] = { false, true, true, true, false };
		int n = A.length;
		if (sortedAfterSwap(A, B, n)) {
			System.out.println("A can be sorted");
		}
		else {
			System.out.println("A can not be sorted");
		}
	}
}