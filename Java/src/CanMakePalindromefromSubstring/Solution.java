package CanMakePalindromefromSubstring;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        int len = queries.length;
        int start, end, k;
        boolean flag = true;;
        List<Boolean> result = new ArrayList<>(len);
        for(int i = 0; i < len; i++){
            start = queries[i][0];
            end = queries[i][1];
            k = queries[i][2];
            flag = true;
            for(int a = start, b = end; a <= b; a++, b--){
                if(s.charAt(a) != s.charAt(b)){
                    k--;
                }
            }
            if(k < 0){
                flag = false;
            }
            result.add(flag);

        }
        return result;

    }
}
