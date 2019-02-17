package array.largestPerimeter;

import java.util.Arrays;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 5:25 PM 2019/2/11
 * @Version :
 */
public class Solution {

    public int largestPerimeter(int[] A) {

        Arrays.sort(A);

        for (int i = A.length - 3; i >= 0; i--) {
            if ((A[i] + A[i + 1]) > A[i + 2]) {
                return A[i] + A[i + 1] + A[i + 2];
            }
        }

        return 0;
    }
}
