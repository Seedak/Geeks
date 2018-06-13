#include <stdio.h>
int findSingle(int ar[], int n){
		int res = ar[0];
		for (int i=1;i<n;i++)
			res=res^ar[i];
		return res;
	}
int main(){
		int ar[] = {2, 3, 5, 4, 5, 3, 4};
		int n = sizeof(ar) / sizeof(ar[0]);
		printf("Element occurring once is %d " ,findSingle(ar, n));
		return 0;
}
