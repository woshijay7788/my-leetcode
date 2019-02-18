package string.reverseString;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 4:43 PM 2019/1/21
 * @Version :
 */
public class Solution {

    public String reverseString(String s) {
        int i = 0;
        int j = s.length() - 1;

        char[] chars = s.toCharArray();

        while (i < j) {
            swap(chars, i, j);
            i++;
            j--;
        }
        return new String(chars);
    }


    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
