package easy.binary.findComplement;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 10:20 AM 2019/1/22
 * @Version :
 */
public class Solution {

    public int findComplement(int num) {

        return ~num & (Integer.highestOneBit(num) - 1);

    }

    public static void main(String[] args) {
        System.out.println(Integer.highestOneBit(5));
        System.out.println(~5 & (Integer.highestOneBit(5) - 1));
    }
}
