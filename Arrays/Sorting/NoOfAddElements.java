// java program for Elements to be added so that all elements of a range are present in array
import java.io.*;
import java.util.*;

public class NoOfAddElements {
	static int countNum(int []arr, int n){
		int count = 0;
		Arrays.sort(arr);
		for (int i = 0; i < n - 1; i++)
			if (arr[i] != arr[i+1] && arr[i] != arr[i + 1] - 1){
				count += arr[i + 1] - arr[i] - 1;
			}
	
		return count;
	}
	static public void main (String[] args){
		
		int []arr = { 3, 5, 8, 6, 6 };
		int n = arr.length;
		
		System.out.println(countNum(arr, n));
	}
}

