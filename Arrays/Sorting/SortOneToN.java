// Efficient Java program to sort an 
// array of numbers in range from 1
// to n.
import java.io.*;
import java.util.*;
public class SortOneToN{
	static void sortit(int []arr, int n){
	    int t;
		for (int i = 0; i < n; i++){
			while (i != (arr[i] - 1)){
			    t = arr[ (arr[i] - 1) ] ;
                arr[ (arr[i] - 1) ] =arr[i];
                arr[i] = t;
			} 
					 
		}
	}
	public static void main(String args[]){
		int []arr = {10, 7, 9, 2, 8, 3, 5, 4, 6, 1};
		int n = arr.length;
		sortit(arr, n);
		for (int i = 0; i < n; i++) 
			System.out.print(arr[i] + " "); 
	}
}