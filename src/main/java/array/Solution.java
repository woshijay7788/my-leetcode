package array;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 11:54 AM 2019/1/25
 * @Version :
 */
public class Solution {

    public int smallestRangeI(int[] A, int K) {

        int max = A[0];
        int min = A[0];

        for (int i = 0; i < A.length; i++) {

            if (A[i] > max) {
                max = A[i];
            }
            if (A[i] < min) {
                min = A[i];
            }

        }
        if (min + K >= max - K) {
            return 0;
        }


        return max - min - 2 * K;
    }
}
