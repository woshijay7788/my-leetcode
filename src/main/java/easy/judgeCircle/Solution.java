package easy.judgeCircle;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 5:05 PM 2019/1/28
 * @Version :
 */
public class Solution {

    public boolean judgeCircle(String moves) {

        if (moves == null || moves.isEmpty()) {
            return true;
        }

        char[] chars = moves.toCharArray();

        int x = 0;

        int y = 0;

        for (int i = 0; i < chars.length; i++) {
            char step = chars[i];
            if (step == 'U') {
                y += 1;
            } else if (step == 'D') {
                y -= 1;
            } else if (step == 'L'){
                x -= 1;
            } else {
                x += 1;
            }
        }

        if (x == 0 && y == 0) {
            return true;
        }

        return false;
    }
}
