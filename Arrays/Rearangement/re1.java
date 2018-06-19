
//Rearrange an array such that arr[i] = i
//Given an array of elements of length N, ranging from 1 to N. 
//All elements may not be present in the array. If element is not present then there will be -1 present in the array.
 //Rearrange the array such that A[i] = i and if i is not present, display -1 at that place.

import java.util.*;
import java.lang.*;
public class Abc {
	public static int[] fix(int[] A)
	{
		for (int i = 0; i < A.length; i++) 
		{
			if (A[i] != -1 && A[i] != i)
			{
				int x = A[i];
				while (A[x] != -1 && A[x] != x) 
				{
					int y = A[x];
					A[x] = x;
					x = y;
				}
				A[x] = x;
				if (A[i] != i)
				{
					A[i] = -1;
				}
			}
		}
		return A;
	}
	public static void main(String[] args)
	{
		int A[] = {-1, -1, 6, 1, 9, 3, 2, -1, 4,-1};
		System.out.println(Arrays.toString(fix(A)));
	}
}
