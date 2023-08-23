package ReverseWordsinaString;

public class Solution {
    public String reverseWords(String s) {
//        String[] tokens = s.trim().split("\\s+");
//        String result = "";
//        for(int i = tokens.length-1; i > 0; i--){
//            result += tokens[i] + " ";
        // String is immutable, this code will create a new string object
        // not efficient.
//        }
//        return result+tokens[0];
        String[] tokens = s.trim().split("\\s+");
        StringBuilder stringbuilder = new StringBuilder();
        for(int i = tokens.length-1; i > 0; i--){
            stringbuilder.append(tokens[i]).append(" ");
        }
        stringbuilder.append(tokens[0]);
        String result = stringbuilder.toString();
        return result;
    }


}
