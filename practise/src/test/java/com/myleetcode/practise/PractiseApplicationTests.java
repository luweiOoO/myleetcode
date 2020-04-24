package com.myleetcode.practise;

import com.myleetcode.practise.middle.LongestPalindromicSubstring;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class PractiseApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void test(){
        LongestPalindromicSubstring substring = new LongestPalindromicSubstring();
        String s = "aabbc";
        String kk = substring.longestPalindrome(s);
        System.out.println("result: " + kk);
    }

}
