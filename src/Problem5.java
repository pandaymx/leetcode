import java.util.ArrayList;
import java.util.List;

public class Problem5 {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        List<Character> list = new ArrayList<>();
        String result = null;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length() ; j++) {
                list.add(s.charAt(j));
                if (j==0) {
                    result = list.get(j).toString();
                } else if (j!=0&j%2==0) {
                    for (int k = 0; k < j/2; k++) {
                        if (list.get(k) !=list.get(j-k)) {
                            break;
                        }else {
                            result = list.toString();
                        }
                    }
                }else {
                    for (int k = 0; k < j/2; k++) {
                        if (list.get(k) !=list.get(j-k)) {
                            break;
                        }else {
                            result = list.toString();
                        }
                    }
                }
            }
        }
        return result;
    }
}
