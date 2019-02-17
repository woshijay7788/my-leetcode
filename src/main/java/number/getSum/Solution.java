package number.getSum;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 9:35 AM 2019/1/29
 * @Version :
 */
public class Solution {

    public int getSum(int a, int b) {

        int sum = 0;

        while ((a & b) != 0) {
            sum = a ^ b;
            a = (a & b) << 1;
            b = sum;
        }

        return sum;
    }
}
