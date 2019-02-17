package number.test2;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 7:00 PM 2019/1/24
 * @Version :
 */
public class Solution {

    public int fib(int N) {

        if (N == 0) {
            return 0;
        }

        if (N == 1) {
            return 1;
        }

        return fib(N - 1) + fib(N - 2);
    }
}
