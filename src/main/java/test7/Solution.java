package test7;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 10:16 AM 2019/1/18
 * @Version :
 */
public class Solution {

    public int numJewelsInStones(String J, String S) {

        char[] jewels = J.toCharArray();
        char[] stone = S.toCharArray();
        int jewelsCount = 0;

        for (int i = 0; i < stone.length; i++) {
            for (int j = 0; j < jewels.length; j++) {
                if (jewels[j] == stone[i]) {
                    jewelsCount++;
                }
            }
        }


        return jewelsCount;
    }

    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";
        System.out.println(new Solution().numJewelsInStones(J, S));
    }
}
