// Java code to find count of Pairs with 
// difference less than K.
import java.io.*;
import java.util.Arrays;

class DiffK{
	static int countPairs(int a[], int n, int k){
		Arrays.sort(a);
	
		int count = 0;
		for (int i = 0; i < n; i++){
			int j = i + 1; 
			while (j < n && a[j] - a[i] < k){
				count++;
				j++;
			}
		}
		return count;
	}
	public static void main (String[] args) 
	{
		int a[] = {1, 10, 4, 2, 11, 3};
		int k = 3;
		int n = a.length;
		System.out.println(countPairs(a, n, k));
	}
}
