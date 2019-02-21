package easy.sortArrayByParity;

import java.util.LinkedList;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 2:55 PM 2019/1/18
 * @Version :
 */
public class Solution {

    public int[] sortArrayByParity(int[] A) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0;i < A.length; i++) {
            if ((A[i] % 2) == 0) {
                list.addFirst(A[i]);
            } else {
                list.addLast(A[i]);
            }
        }

        int[] newA = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newA[i] = list.get(i);
        }

        return newA;
    }

    public static void main(String[] args) {
        System.out.println(3 % 2);
    }
}
