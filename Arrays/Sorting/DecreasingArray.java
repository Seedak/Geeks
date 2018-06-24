// Java program to make an
// array decreasing
import java.util.*;
import java.lang.*;

public class DecreasingArray{
	public static int min_noOf_operation(int arr[], int n, int k){
		int noOfSubtraction;
		int count = 0;
		for (int i = 1; i < n; i++){
			noOfSubtraction = 0;
			if (arr[i] > arr[i - 1]){
				noOfSubtraction = Math.abs(arr[i] - arr[i - 1]) / k;
				if (Math.abs(arr[i] - arr[i - 1]) % k != 0)
					noOfSubtraction++;
				arr[i] = arr[i] - (k * noOfSubtraction);
			}
			count = count + noOfSubtraction;
		}

		return count;
	}
	public static void main(String argc[]){
		int arr[] = { 1, 1, 2, 3, 11 };
		int N = arr.length;
		int k = 5;
		System.out.println(min_noOf_operation(arr, N, k)); 
	}
	
}
