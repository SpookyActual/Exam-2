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
     
