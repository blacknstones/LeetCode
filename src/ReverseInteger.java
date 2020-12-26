/** 
 * Given a 32-bit signed integer, reverse digits of an integer.
 * 
 * Example:
 * Input: x = 123
 * Output: 321
 *
 * author: Yanwei Zhu
 * version: 2020.12.26
 */

class Solution {
    public int reverse(int x) {
        int reverse = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            x /= 10;
            reverse = reverse * 10 + lastDigit;
        } 
        return reverse; 
    }
}