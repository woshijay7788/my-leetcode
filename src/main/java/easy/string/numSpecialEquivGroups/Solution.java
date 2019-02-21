package easy.string.numSpecialEquivGroups;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 5:59 PM 2019/2/11
 * @Version :
 */
public class Solution {

    public int numSpecialEquivGroups(String[] A) {

        Set<String> seen = new HashSet();
        for (String S : A) {
            int[] count = new int[52];
            for (int i = 0; i < S.length(); ++i) {
                count[S.charAt(i) - 'a' + 26 * (i % 2)]++;
            }
            seen.add(Arrays.toString(count));
        }
        return seen.size();
    }
}
