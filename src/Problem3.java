import java.util.HashSet;
import java.util.Set;
//给定一个字符串 s ，请你找出其中不含有重复字符的最长子串的长度。
public class Problem3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        // 设置一个set集合
        Set<Character> set = new HashSet<>();
        // 确定返回的长度
        int length = 0;
        //获得String的长度 通过这个循环来确定比如从第一个单词开始找他的最小子串
        for (int i = 0; i < s.length(); i++) {
            int j = i;
            while (j<s.length()) {
                boolean add = set.add(s.charAt(j));
                int size = set.size();
                if (add==true) {
                    if (size >=length) {
                        length =size;
                    }
                }
                if (add == false) {
                        break;
                    }
                j++;
                }
            set.clear();

            }


        return length;
    }
}
