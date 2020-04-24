package com.myleetcode.practise.middle;

public class LongestPalindromicSubstring {
    /**
     * 给定一个字符串s，找到s中最长的回文子串。你可以假设s的最大长度为1000
     * 例1：输入"babad" 输出"bab" 注意："aba也是一个有效答案"
     * 例2：输入："cbbd" 输出："bb"
     *
     */
    public String longestPalindrome(String s){
     if(s == null || s.length() == 0){
         return "";
     }
     int [] range = new int[2];
     char[] str = s.toCharArray();
     for(int i = 0; i < s.length(); i++){
         i = findLongest(str, i, range);
     }
     return s.substring(range[0],range[1] + 1);
    }

    public static int findLongest(char[] str, int low, int[] range){
        int high = low;
        while(high < str.length - 1 && str[high + 1] == str[low]){
            high++;
        }
        int ans = high;
        while(low > 0 && high < str.length - 1 && str[low - 1] == str[high + 1]){
            low--;
            high++;
        }
        if(high - low > range[1] - range[0]){
            range[0] = low;
            range[1] = high;
        }
        return ans;
    }
}
