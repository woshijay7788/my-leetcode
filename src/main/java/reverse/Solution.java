package reverse;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 3:32 PM 2018/12/19
 * @Version :
 */
public class Solution {

    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(String.valueOf(1));

        System.out.println(Integer.MAX_VALUE % 10);
        System.out.println(Integer.MIN_VALUE % 10);
        System.out.println(10 / 120);
        System.out.println(20 % 10);
        System.out.println(new Solution().reverse(111));
    }
}
