package test9;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 11:39 AM 2019/1/18
 * @Version :
 */
public class Solution {

    char[] Upper = {'A','B','C', 'D', 'E', 'F', 'G', 'H', 'I',
        'G', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
        'V', 'W', 'X', 'Y', 'Z'};
    char[] Lower = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
        'i', 'g', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
        'u', 'v', 'w', 'x', 'y', 'z'};

    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < Upper.length; j++) {
                if (chars[i] == Upper[j]) {
                    chars[i] = Lower[j];
                }
            }
        }
        return new String(chars);
    }
}
