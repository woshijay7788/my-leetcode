package easy.array.sortArrayByParityII;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 5:47 PM 2019/1/28
 * @Version :
 */
public class Solution {

    public int[] sortArrayByParityII(int[] A) {

        if (A == null || A.length == 0) {
            return null;
        }

        int i = 0;
        int j = 1;
        int[] newA = new int[A.length];

        for (int num : A) {
            if ((num % 2) == 0) {
                newA[i] = num;
                if (i + 2 < A.length - 1) {
                    i += 2;
                }
            } else {
                newA[j] = num;
                if (j + 2 < A.length - 1) {
                    j += 2;
                }
            }

        }
        return newA;
    }

}
