import java.util.Arrays;

/*

Problem 02: You are given two sorted arrays A and B
where A has a large enough buffer at the end to hold B.
 Write a function to merge B into A in sorted order.



 */
public class Problem02extracredit
{

    public static void main(String[] args) {
        int[] A = {1, 3, 5, 0, 0, 0}; // Example values
        int[] B = {2, 4, 6};

        mergeArrays(A, 3, B, 3);
        System.out.println(Arrays.toString(A)); // Output: [1, 2, 3, 4, 5, 6]
    }

    public static void mergeArrays(int[] A, int m, int[] B, int n) {
        int indexA = m - 1;
        int indexB = n - 1;
        int indexMerged = m + n - 1;

        while (indexB >= 0) {
            if (indexA >= 0 && A[indexA] > B[indexB]) {
                A[indexMerged] = A[indexA];
                indexA--;
            } else {
                A[indexMerged] = B[indexB];
                indexB--;
            }
            indexMerged--;
        }
    }
/*

Time Complexity Analysis: The time complexity is O(m+n),
where m and n are the lengths of arrays A and B respectively, since we only traverse each array once.

Space Complexity Analysis:
The space complexity is O(1) since we are
modifying the input array A in-place without using any extra space.
 */


}
