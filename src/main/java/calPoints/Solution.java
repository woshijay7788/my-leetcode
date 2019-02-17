package calPoints;

import java.util.LinkedList;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 3:09 PM 2019/1/28
 * @Version :
 */
public class Solution {

    public int calPoints(String[] ops) {

        int sum = 0;

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < ops.length; i++) {
            switch (ops[i]) {
                case "+":
                    Integer lastFist = list.pollLast();
                    Integer lastSecond = list.pollLast();
                    Integer score1 = lastFist + lastSecond;
                    list.addLast(lastSecond);
                    list.addLast(lastFist);
                    list.addLast(score1);
                    break;
                case "D":
                    Integer last = list.peekLast();
                    Integer score2 = last * 2;
                    list.addLast(score2);
                    break;
                case "C":
                    list.pollLast();
                    break;
                default:
                    list.addLast(Integer.valueOf(ops[i]));
                    break;
            }
        }

        for (Integer num : list) {
            sum += num;
        }

        return sum;
    }
}
