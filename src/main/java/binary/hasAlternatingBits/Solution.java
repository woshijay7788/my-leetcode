package binary.hasAlternatingBits;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 11:13 AM 2019/1/28
 * @Version :
 */
public class Solution {

    public boolean hasAlternatingBits(int n) {

        return ((n + (n >> 1)) & (n + (n >> 1) + 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(2 >> 1);
    }
}
