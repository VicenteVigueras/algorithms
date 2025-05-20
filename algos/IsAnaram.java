package algos;

import java.util.Arrays;

public class IsAnaram {
    public boolean isAnagram(String s, String t) {
        //sort s
        char[] s_array = s.toCharArray();
        Arrays.sort(s_array);
        
        //sort t
        char[] t_array = t.toCharArray();
        Arrays.sort(t_array);

        if(s.length() != t.length()) {
            return false;
        }

        //compare
        for(int i = 0; i < s_array.length; i++) {
            if(s_array[i] != t_array[i]) {
                return false;
            }
        }
        return true;
    }
}
