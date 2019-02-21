package easy.numberOfLines;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 2:28 PM 2019/1/28
 * @Version :
 */
public class Solution {

    public int[] numberOfLines(int[] widths, String S) {

        if (S == null || S.isEmpty()) {
            return null;
        }

        char[] chars = S.toCharArray();

        int line = 100;
        int[] result = {1, 0};
        for (int i = 0; i < chars.length; i++) {
            char letter = chars[i];
            int width = widths[letter - 'a'];
            if (line - width >= 0) {
                line = line - width;
            } else {
                result[0] += 1;
                line = 100 - width;
            }
        }

        result[1] = 100 - line;

        return result;
    }

}
