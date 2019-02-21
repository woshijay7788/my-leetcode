package easy.binary.singleNumber;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 3:20 PM 2019/2/12
 * @Version :
 */
public class Solution {

    public int singleNumber(int[] nums) {

        int single = 0;
        for (int i = 0; i < nums.length; i++) {
            single = single ^ nums[i];
        }
        return single;
    }

    public static void main(String[] args) {
        System.out.println(1 ^ 4 ^ 2 ^ 1 ^ 2);

        System.out.println(1 ^ 2 ^ 1 ^ 2 ^ 4);
    }
}
