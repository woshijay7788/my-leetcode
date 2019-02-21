package easy.findWords;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 4:23 PM 2019/1/22
 * @Version :
 */
public class Solution {


    private String fisrt = "qwertyuiopQWERTYUIOP";

    private String second = "asdfghjklASDFGHJKL";

    private String third = "zxcvbnmZXCVBNM";

    public String[] findWords(String[] words) {

        if (words == null) {
            return null;
        }

        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();

            if (check(chars, fisrt)) {
                list.add(words[i]);
            }

            if (check(chars, second)) {
                list.add(words[i]);
            }

            if (check(chars, third)) {
                list.add(words[i]);
            }


        }
        String[] strings = new String[list.size()];
        return list.toArray(strings);
    }

    public boolean check(char[] chars, String s) {
        for (int i = 0; i < chars.length; i++) {
            if (!s.contains(chars[i] + "")) {
                return false;
            }
        }
        return true;
    }
}
