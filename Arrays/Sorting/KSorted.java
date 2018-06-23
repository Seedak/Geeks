//Sort a nearly sorted (or K sorted) array
import java.io.*;
import java.util.Arrays;
class NearlySorted{
    static void KSort(int A[], int size){
        int i, key, j;
        for (i = 1; i < size; i++){
	    key = A[i];
	    j = i-1;
	    while (j >= 0 && A[j] > key){
		    A[j+1] = A[j];
		    j = j-1;
	    }
	    A[j+1] = key;
      }
    }
    public static void main (String[] args)
	{
		int arr[] = {1, 12, 4, 6, 7, 10};
		int n = arr.length;
		KSort(arr, n);
		System.out.println(Arrays.toString(arr));
	}
}