package string.minDeletionSize;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 5:21 PM 2019/1/28
 * @Version :
 */
public class Solution {

    public int minDeletionSize(String[] A) {

        if (A == null || A.length == 0) {
            return 0;
        }

        int N = A[0].length();
        int res = 0;
        for (int j = 0; j < N; j++) {
            int index = 0;
            boolean flag = true;
            while ((index + 1) < A.length) {
                if ((A[index].charAt(j) - A[index + 1].charAt(j)) > 0) {
                    flag = false;
                    break;
                } else {
                    index = index + 1;
                }
            }
            if (!flag) {
                res += 1;
            }

        }

        return res;
    }

}
