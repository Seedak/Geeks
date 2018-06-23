// Java Code to find Smallest 
// Difference between two Arrays
import java.util.*;

class SmallestDifference{
	static int findSmallestDifference(int A[], int B[],int m, int n){
		Arrays.sort(A);
		Arrays.sort(B);
		int a = 0, b = 0;
		int result = Integer.MAX_VALUE;
		while (a < m && b < n)
		{
			if (Math.abs(A[a] - B[b]) < result)
				result = Math.abs(A[a] - B[b]);
			if (A[a] < B[b])
				a++;
			else
				b++;
		}
		return result; 
	}
	public static void main(String[] args){
		int A[] = {1, 2, 11, 5};
		int B[] = {4, 12, 19, 23, 127, 235};
		int m = A.length;
		int n = B.length;
		System.out.println(findSmallestDifference(A, B, m, n));
		
	}
}