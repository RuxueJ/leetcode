package ReverseVowelsofaString;

import java.util.HashSet;
import java.util.Set;

//Given a string s, reverse only all the vowels in the string and return it.
//
//        The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
//
//
//
//        Example 1:
//
//        Input: s = "hello"
//        Output: "holle"
//        Example 2:
//
//        Input: s = "leetcode"
//        Output: "leotcede"
//
//
//        Constraints:
//
//        1 <= s.length <= 3 * 105
//        s consist of printable ASCII characters.
class Solution {
    public String reverseVowels(String s) {
        char[] charArray = s.toCharArray();
        Set<Character> charSet = new HashSet<>();
        charSet.add('a');
        charSet.add('o');
        charSet.add('i');
        charSet.add('e');
        charSet.add('u');
        charSet.add('A');
        charSet.add('O');
        charSet.add('I');
        charSet.add('E');
        charSet.add('U');


        int i = 0;
        int j = charArray.length - 1;
        int size = charArray.length;

        while(i < j){
            while((i < size) && (!charSet.contains(charArray[i]))){
                i++;
            }
            while((i < size) && (!charSet.contains(charArray[j]))){
                j--;
            }
            if(i < j){
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
                i++;
                j--;
            }


        }
        System.out.println("finish looping");
        String result = new String(charArray);
        return result;

    }

}
