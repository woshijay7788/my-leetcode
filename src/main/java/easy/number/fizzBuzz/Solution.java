package easy.number.fizzBuzz;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 5:33 PM 2019/1/30
 * @Version :
 */
public class Solution {

    public List<String> fizzBuzz(int n) {

        List<String> list = new ArrayList<>();

        if (n == 0) {
            list.add(0 + "");
            return list;
        }

        for (int i = 1; i <= n; i++) {

            if (i % 15 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(i + "");
            }

        }

        return list;
    }
}
