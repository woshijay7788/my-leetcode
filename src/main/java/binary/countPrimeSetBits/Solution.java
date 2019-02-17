package binary.countPrimeSetBits;

/**
 * @Description: 给定两个整数 L 和 R ，找到闭区间 [L, R] 范围内，计算置位位数为质数的整数个数。
 *
 * （注意，计算置位代表二进制表示中1的个数。例如 21 的二进制表示 10101 有 3 个计算置位。还有，1 不是质数。）
 *
 * 示例 1: 输入: L = 6, R = 10
 *
 * 输出: 4
 *
 * 解释: 6 -> 110 (2 个计算置位，2 是质数) 7 -> 111 (3 个计算置位，3 是质数) 9 -> 1001 (2 个计算置位，2 是质数) 10-> 1010 (2
 * 个计算置位，2 是质数)
 *
 * Write a helper function to count the number of set bits in a number, then check whether the
 * number of set bits is 2, 3, 5, 7, 11, 13, 17 or 19.
 * @Author : lguo
 * @Date : Created in 2:16 PM 2019/2/15
 * @Version :
 */
public class Solution {

    public int countPrimeSetBits(int L, int R) {
        int count = 0;
        for (int i = L; i <= R; i++) {
            int k = Integer.bitCount(i);
            if (isPrime(k)) {
                count++;
            }
        }
        return count;
    }

    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = (int) Math.sqrt((double) num); i > 1; i--) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Integer.bitCount(7));
    }

    /**
     * public int countPrimeSetBits(int L, int R) {
     HashSet<Integer> zs=new HashSet<>();
     for(int i:new int[]{2,3,5,7,11,13,17,19,23,29,31})
     zs.add(i);
     int count=0;
     for(int n=L;n<=R;n++){
     if(zs.contains(Integer.bitCount(n)))
     count++;
     }
     return count;
     }
     */
}
