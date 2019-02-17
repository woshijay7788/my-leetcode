package array.arrayPairSum;

import java.util.Arrays;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 11:36 AM 2019/1/25
 * @Version :
 */
public class Solution {

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];

        }

        return sum;
    }
}
