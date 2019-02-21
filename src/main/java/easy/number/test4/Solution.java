package easy.number.test4;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 7:46 PM 2019/1/24
 * @Version :
 */
public class Solution {

    public int addDigits(int num) {

        return 1 + (num - 1) % 9;
    }
}
