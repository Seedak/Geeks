//Reorder an array according to given indexes
//Given two integer arrays of same size, “arr[]” and “index[]”, reorder elements in “arr[]” according to given index array. 

import java.util.Arrays;

class Test
{
	static void reorder(int arr[], int index[])
	{
		int temp[] = new int[arr.length];
		for (int i=0; i<arr.length; i++)
			temp[index[i]] = arr[i];
		for (int i=0; i<arr.length; i++)
		{ 
		arr[i] = temp[i];
		index[i] = i;
		}
	}
	public static void main(String[] args) 
	{
		int arr[] = new int[]{50, 40, 70, 60, 90};
        int index[] = new int[]{3, 0, 4, 1, 2};
		reorder(arr, index);
		
		System.out.println("Reordered array is: ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Modified Index array is:");
		System.out.println(Arrays.toString(index));
		
	}
}