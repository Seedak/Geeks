//Given two arrays of equal size N, form maximum number of pairs by using their elements, 
//one from the first array and second from the second array, 
//such that an element from each array is used at-most once and
//the absolute difference between the selected elements used for 
//forming a pair is less than or equal to a given element K.

import java.*;
import java.util.Arrays;
class NoOfMaxPairs{
    static int findMaxPairs(int a[], int b[], int n, int k){
	    Arrays.sort(a); 
	    Arrays.sort(b);
	    int result = 0;
	    for (int i=0, j=0; i<n && j<n;){
		    if (Math.abs(a[i] - b[j]) <= k){
			    result++;
			    i++;
		    	j++;
		    }
		    else if(a[i] > b[j]){
			j++;
		    }
		    else{
			    i++;
		    }
	    }
	    return result;
    }
    public static void main(String[] args){
	    int a[] = {10, 15, 20};
	    int b[] = {17, 12, 24};
	    int n = a.length;
	    int k = 3;
        System.out.println(findMaxPairs(a, b, n, k));
    }
}
