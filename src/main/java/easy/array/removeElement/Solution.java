package easy.array.removeElement;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 9:54 AM 2019/2/13
 * @Version :
 */
public class Solution {

    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
