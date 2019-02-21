package easy.repeatedNTimes;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 11:55 AM 2019/1/18
 * @Version :
 */
public class Solution {

    public int repeatedNTimes(int[] A) {
        int length = A.length;

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < length; i++) {

            if (!set.contains(A[i])) {
                set.add(A[i]);
            } else {
                return A[i];
            }
        }

        return 0;
    }
}
