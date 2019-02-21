package easy.string.findLUSlength;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 2:51 PM 2019/1/28
 * @Version :
 */
public class Solution {

    public int findLUSlength(String a, String b) {

        if (a.equals(b)) {
            return -1;
        }
        return a.length() > b.length() ? a.length() : b.length();
    }
}
