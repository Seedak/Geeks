#include <stdio.h>
#include <limits.h>
int findMaxSubarraySumUtil(int A[], int B[],
                           int n, int m)
{
    int max_so_far = INT_MIN, curr_max = 0;
 
    for (int i = 0; i < n; i++) {

        if (binary_search(B, B + m, A[i])) {
            curr_max = 0;
            continue;
        }

        curr_max = max(A[i], curr_max + A[i]);
        max_so_far = max(max_so_far, curr_max);
    }
    return max_so_far;
}

void findMaxSubarraySum(int A[], int B[], 
                        int n, int m)
{
    sort(B, B + m);
 
    int maxSubarraySum = findMaxSubarraySumUtil(A, B, 
                                                n, m);
  
    if (maxSubarraySum == INT_MIN) {
        printf("Maximum subarray sum cant be found");
    }
    else {
        printf("The Maximum subarray sum = %d", maxSubarraySum);
    }
}
int main()
{
    int A[] = { 3, 4, 5, -4, 6 };
    int B[] = { 1, 8, 5 };
 
    int n = sizeof(A) / sizeof(A[0]);
    int m = sizeof(B) / sizeof(B[0]);
    findMaxSubarraySum(A, B, n, m);
    return 0;
}
