// Java program to rearrange the array
// Rearrange array such that arr[i] >= arr[j] if i is even and arr[i]<=arr[j] if i is odd and j < i
import java.util.*;
import java.lang.*;
 
public class ABC{
    public static void rearrangeArr(int arr[], int n){
        int evenPos = n / 2;
        int oddPos = n - evenPos;
 
        int[] tempArr = new int [n];
        for (int i = 0; i < n; i++)
            tempArr[i] = arr[i];y
        Arrays.sort(tempArr);
 
        int j = oddPos - 1;
        for (int i = 0; i < n; i += 2) {
            arr[i] = tempArr[j];
            j--;
        }
 
        j = oddPos; 
        for (int i = 1; i < n; i += 2) {
            arr[i] = tempArr[j];
            j++;
        }
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String argc[]){
        int[] arr = new int []{ 1, 2, 3, 4, 5,
                                        6, 7 };
        int size = 7;
        rearrangeArr(arr, size);
         
    }
}