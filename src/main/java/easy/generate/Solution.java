package easy.generate;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 3:43 PM 2019/1/28
 * @Version :
 */
public class Solution {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        if (numRows == 0) {
            return result;
        }

        List<Integer> triangle = new ArrayList<>();
        triangle.add(1);
        result.add(triangle);

        for (int i = 1; i < numRows; i++) {
            List<Integer> newTriangle = new ArrayList<>();
            List<Integer> preTriangle = result.get(i - 1);

            newTriangle.add(1);

            for (int j = 1; j < i; j++) {
                newTriangle.add(preTriangle.get(j - 1) + preTriangle.get(j));
            }

            newTriangle.add(1);

            result.add(newTriangle);
        }

        return result;
    }
}
