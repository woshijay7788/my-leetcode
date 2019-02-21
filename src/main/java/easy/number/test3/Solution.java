package easy.number.test3;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 7:08 PM 2019/1/24
 * @Version :
 */
public class Solution {

    public int titleToNumber(String s) {

        if (s == null && s.isEmpty()) {
            return -1;
        }

        Map<Character, Integer> map = new HashMap<>();
        char start = 'A';
        for (int i = 1; i <= 26; i++) {
            map.put(start, i);
            start += 1;
        }

        int result = 0;
        int i = s.length() - 1;
        int t = 0;

        while (i >= 0) {
            char curr = s.charAt(i);
            result = result + (int)Math.pow(26, t) * map.get(curr);
            t++;
            i--;
        }


        return result;
    }


    public int titleToNumber1(String s) {
        char[] ch = s.toCharArray();
        int total=0;
        int square;
        int j=ch.length-1;
        if(ch.length==0){return 0;}
        for(int i=0;i<ch.length;i++){
            square = (int) Math.pow(26,j);
            j--;
            total += ((int)ch[i]-64)*square;
        }
        return total;
    }

}
