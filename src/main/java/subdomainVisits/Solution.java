package subdomainVisits;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 10:14 AM 2019/1/28
 * @Version :
 */
public class Solution {


    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < cpdomains.length; i++) {
            String[] strings = cpdomains[i].split(" ");
            String domain = strings[1];

            boolean flag = true;
            while (flag) {
                if (map.get(domain) == null) {
                    map.put(domain, Integer.valueOf(strings[0]));
                } else {
                    map.put(domain, map.get(domain) + Integer.valueOf(strings[0]));
                }

                if (domain.indexOf(".") != -1) {
                    domain = domain.substring(domain.indexOf(".") + 1);
                } else {
                    flag = false;
                }
            }
        }

        List<String> list = new ArrayList<>();

        for (String key : map.keySet()) {
            list.add(map.get(key) + " " + key);
        }

        return list;
    }

    public static void main(String[] args) {
        System.out
            .println(new Solution().subdomainVisits(new String[]{"9001 discuss.leetcode.com"}));
    }
}
