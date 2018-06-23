//Given an Array, three operations can be performed using any external number x.
//1)Add x to an element once
//2)Subtract x from an element once
//3)Perform no operation on the element
//Find whether there exists a number X, such that if the above operations are performed with the number X, the resulting array has equal elements.
//If the number exists, print “YES” and the value, space separated, else print “NO”

import java.io.*;
import java.util.Arrays;
class Equalize{
    static int numUnique(int []arr, int n){
         if(n > 0){
        int countUnique = 1;
        for(int i = 0; i < n - 1; i++){
            if(arr[i] != arr[i+1]){
                countUnique++;
            }
        }
        return countUnique;
    } else {
        return 0;
    }
    }
    
    static int Abc(int []arr, int n){
        int countUnique = numUnique(arr, n);
        System.out.println(countUnique + "");
        if(countUnique==1){
            System.out.println("Yes with x=0");
            return 0;
        }
        if(countUnique==2){
           for(int i=0; i< n; i++){
               if(arr[i]!=arr[i+1]){
                int x= Math.abs(arr[i+1]-arr[i]);
                System.out.println("Yes with x= " + x);  
                return 0;
                 }

           }
        }
        if(countUnique==3){
            int[] unique = new int[10];
            unique[0]=arr[0];
            int k=1;
            for (int i = 0; i < n; i++){
                int j;
                for (j = 1; j < i; j++){
                    if (arr[i] == arr[j]){
                       j++;
                    }
                    if (arr[i] != arr[j]){
                        unique[k]=arr[i];
                        k++;
                    }
                    
               }
            }
            if(Math.abs(unique[2] - unique[1]) == Math.abs(unique[1] - unique[0])){
                int x=unique[2] - unique[1];
                System.out.println("Yes with x= " +x);  
                return 0;
            }
        }
        System.out.println("No");  
        return 0;
    }
    
    public static void main (String[] args){
		int arr[] = {1, 1, 3, 5, 5};
		int n = arr.length;
        Arrays.sort(arr);
		Abc(arr, n);
	}
}