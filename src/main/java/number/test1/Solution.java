package number.test1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 2:53 PM 2019/1/22
 * @Version :
 */
public class Solution {

    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (check(i)) {
                res.add(i);
            }
        }
        return res;
    }

    private boolean check(int n) {
        int d = n;
        while (d != 0) {
            int c = d % 10;
            if (c == 0 || (n % c) != 0) {
                return false;
            }
            d /= 10;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(13 % 3);
        // new MyQueue().selfDividingNumbers(1, 22);
    }
}

