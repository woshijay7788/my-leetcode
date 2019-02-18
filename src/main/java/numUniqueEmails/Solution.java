package numUniqueEmails;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 10:26 AM 2019/1/18
 * @Version :
 */
public class Solution {

    public int numUniqueEmails(String[] emails) {

        Set<String> set = new HashSet<>();
        for (int i = 0; i < emails.length; i++) {
            String email = emails[i];
            String arr[] = email.split("@");
            String localName = arr[0];

            if (localName.contains("+")) {
                int index = localName.indexOf("+");
                localName = localName.substring(0, index);
            }

            if (localName.contains(".")) {
                localName = localName.replace(".", "");
            }

            set.add(new String(localName + "@" + arr[1]));

        }

        return set.size();
    }

    public static void main(String[] args) {
        String arr[] = {"fg.r.u.uzj+o.pw@kziczvh.com",
            "r.cyo.g+d.h+b.ja@tgsg.z.com", "fg.r.u.uzj+o.f.d@kziczvh.com",
            "r.cyo.g+ng.r.iq@tgsg.z.com", "fg.r.u.uzj+lp.k@kziczvh.com",
            "r.cyo.g+n.h.e+n.g@tgsg.z.com", "fg.r.u.uzj+k+p.j@kziczvh.com",
            "fg.r.u.uzj+w.y+b@kziczvh.com", "r.cyo.g+x+d.c+f.t@tgsg.z.com",
            "r.cyo.g+x+t.y.l.i@tgsg.z.com", "r.cyo.g+brxxi@tgsg.z.com",
            "r.cyo.g+z+dr.k.u@tgsg.z.com", "r.cyo.g+d+l.c.n+g@tgsg.z.com",
            "fg.r.u.uzj+vq.o@kziczvh.com", "fg.r.u.uzj+uzq@kziczvh.com",
            "fg.r.u.uzj+mvz@kziczvh.com", "fg.r.u.uzj+taj@kziczvh.com",
            "fg.r.u.uzj+fek@kziczvh.com"};

        //System.out.println(arr.length);

        System.out.println(new Solution().numUniqueEmails(arr));
        //"aa".toLowerCase()

        //System.out.println("test+.email+alex@leetcode.com".indexOf("+"));
    }
}
