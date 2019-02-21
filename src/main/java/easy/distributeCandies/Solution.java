package easy.distributeCandies;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 5:12 PM 2019/2/11
 * @Version :
 */
public class Solution {

    public int distributeCandies(int[] candies) {

        int size = candies.length / 2;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < candies.length; i++) {
            if (map.size() < size) {
                map.put(candies[i], candies[i]);
                if (map.size() == size) {
                    break;
                }
            }
        }

        return map.size();
    }
}
