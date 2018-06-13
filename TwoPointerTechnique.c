#include <stdio.h>
#include <stdlib.h>

void validate(int arr[]){
    if(arr==NULL){
        printf("array is empty");
        exit(0);
    }
}
int *isPairSum(int A[], int N, int X)
{
    int i = 0;

    int j = N - 1;
    static int result[10];
 
    while (i < j) {
        if (A[i] + A[j] == X){
            result[0]=A[i];
            result[1]=A[j];
            return result;
        }
        else if (A[i] + A[j] < X)
            i++;
        else
            j--;
    }
    printf ("No such numbers exist in the array");
}
int main()
{
	int a[] = {10, 20, 35, 50, 75, 80};
	int size = (sizeof(a))/sizeof(a[0]);
	int x=70;
    validate(a);
    int *p;
	p=isPairSum(a, size, x);
	int result[1];
    int i;
	for ( i = 0; i < 10; i++ ) {
      result[i]= *(p+i);
   }
	printf("%d , %d", result[0], result[1]);
	
	return 0;
}
