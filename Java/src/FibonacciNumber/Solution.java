package FibonacciNumber;

//509. Fibonacci Number
//        Easy
//        7.4K
//        326
//        Companies
//        The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
//
//        F(0) = 0, F(1) = 1
//        F(n) = F(n - 1) + F(n - 2), for n > 1.
//        Given n, calculate F(n).
//
//
//
//        Example 1:
//
//        Input: n = 2
//        Output: 1
//        Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
//        Example 2:
//
//        Input: n = 3
//        Output: 2
//        Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
//        Example 3:
//
//        Input: n = 4
//        Output: 3
//        Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
//
//
//        Constraints:
//
//        0 <= n <= 30
public class Solution {
    public int fib(int n) {
        int result = 0;
        if(n == 0){
            result = 0;
        }
        if(n == 1){
            result = 1;
        }
        if(n > 1){
            int first = 0;
            int second = 1;
            int temp;
            for(int i = 0; i < n-1; i++){
                temp = second;
                second = first + second;
                first = temp;
            }
            result = second;
        }
        return result;
    }
}
