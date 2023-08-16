package ValidParenthese;

import java.util.Stack;

//   Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//   An input string is valid if:
//
//   Open brackets must be closed by the same type of brackets.
//   Open brackets must be closed in the correct order.
//   Every close bracket has a corresponding open bracket of the same type.
//
//
//   Example 1:
//
//   Input: s = "()"
//   Output: true
//   Example 2:
//
//   Input: s = "()[]{}"
//   Output: true
//   Example 3:
//
//   Input: s = "(]"
//   Output: false
//
//
//   Constraints:
//
//   1 <= s.length <= 104
//   s consists of parentheses only '()[]{}'.
public class Solution {
    public boolean isValid(String s) {

        Stack stack = new Stack<Character>();
        boolean isValid = true;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }
            if (ch == ')'){
                if(stack.isEmpty() || !stack.pop().equals('(')){
                    isValid = false;
                    break;
                }
            }
            if (ch == ']'){
                if(stack.isEmpty() || !stack.pop().equals('[')){
                    isValid = false;
                    break;
                }
            }
            if (ch == '}'){
                if(stack.isEmpty() || !stack.pop().equals('{')){
                    isValid = false;
                    break;
                }
            }
        }
        return isValid;
    }
}
