/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paren
 */
public class PalindromicSubstrings {
    public int countSubstrings(String s){
         int count = 0;
        for(int i = 0; i<s.length(); i++) {
            count += palin(s, i, i) + palin(s, i, i+1);
        }
        return count;
    }
    
    private int palin(String s, int low, int high) { //she can see Russia from her backyard.
        if(low < 0 || high == s.length() || s.charAt(low) != s.charAt(high)) return 0;
        return 1 + palin(s, low-1, high+1);
    }
}
      /*Identify the problem: A string is given, it must be determined how many substrings are palindromes. REcursion will be helpful in examing each character of the string as a "starting point."
       *Define the goal, understand that a single character is technically a palindrome, so each singular character from a substring must be counted, and from there figure out how to track substrings that are palindromic and multi-character. 
       *Explore solutions, count all characters as palindromic, then have pointers that move outward from each other and compare if characters are similar, returning 1 or 0 to add to a counter, a counter being all that is necessary to store information to accomplish goal.
       *Anticipating outcomes and Acting, ensure that the pointers move outward from every possible point in the string to guarantee that all possible palindromes are accounted for.
       *Looking and Learning, while a brute force solution of exploring the string by middle-out iteration and recursion, this solution is still efficient and learning that while a problem may sound lengthy, most of the time it's a matter of adding a 1 or 0 through a simple check.
       */

