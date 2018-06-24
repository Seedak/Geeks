// Java program to find Probability 
// of a random pair being the maximum
// weighted pair
import java.io.*;

class MaxCount {
	static double probability(int a[], int b[], int size1,int size2){
		int max1 = Integer.MIN_VALUE, count1 = 0;
		for (int i = 0; i < size1; i++) {
			if (a[i] > max1) {
				max1 = a[i];
				count1 = 1;
			}
			else if (a[i] == max1) {
				count1++;
			}
		}
		int max2 = Integer.MIN_VALUE, count2 = 0;
		for (int i = 0; i < size2; i++) {
			if (b[i] > max2) {
				max2 = b[i];
				count2 = 1;
			}
			else if (b[i] == max2){
				count2++;
			}
		}
		return (double)(count1 * count2) / (size1 * size2);
	}
	public static void main(String args[])
	{
		int a[] = { 1, 2, 3, 7, 8, 1, 8, 8 };
		int b[] = { 1, 3, 3, 3, 3 };
	
		int size1 = a.length;
		int size2 = b.length;
		System.out.println(probability(a, b, size1, size2));
	}
}