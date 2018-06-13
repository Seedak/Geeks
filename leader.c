#include<stdio.h>
#include <stdlib.h>
void validate(int arr[]){
    if(arr==NULL){
        printf("array is empty");
        exit(0);
    }
}
void printLeaders(int arr[], int size)
{
	for (int i = 0; i < size; i++)
	{
		int j;
		for (j = i+1; j < size; j++)
		{
			if (arr[i] <= arr[j])
				break;
		} 
		if (j == size)
			printf("%d ", arr[i]);
}
}
int main()
{
	int arr[] = {16, 17, 4, 3, 5, 2};
	int n = sizeof(arr)/sizeof(arr[0]);
	validate(arr);
	printLeaders(arr, n);
	return 0;
}
