#include <stdio.h>
#include <stdlib.h>

int search(int arr[],int n,int x,int k){
    int i=0;
    while(i<n){
        if(arr[i]==x){
            return i;
        }
        
        else{
            int temp=abs(arr[i]-x)/k;
            if(temp<1){
                i=i+1;
            }
            else{
                i=i+temp;
            }
        }
    }
    printf("key not found, sorry! \n");
    return -1;
}

int main()
{
	int arr[] = {2, 4, 5, 6, 7 };
	int x = 6;
	int i;
	int k = 2;
	int n = sizeof(arr)/sizeof(arr[0]);
    i=search(arr, n, x, k);
    	printf( "Element %d is present at index %d",x,i);
	return 0;
}
