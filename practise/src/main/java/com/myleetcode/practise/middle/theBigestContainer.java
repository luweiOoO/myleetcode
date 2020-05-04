package com.myleetcode.practise.middle;

public class theBigestContainer {
    /**
     * 暴力解法
     * 时间复杂度太高，嵌套循环，n的平方，不推荐
     * @param height
     * @return
     */
    public static int maxArea(int[] height){
        int result = 0;
        for(int i=0; i < height.length; i++){
            for(int j=0; j < height.length; j++){
                if(i != j){
                    int tmp = (i - j) * (height[i] > height[j] ? height[j] : height[i]);
                    tmp = tmp > 0 ? tmp : -tmp;
                    if(tmp > result){
                        result = tmp;
                    }
                }
            }
        }
        return result;
    }

    /**
     * 使用双指针计算，时间复杂度为n
     * @param height
     * @return
     */
    public static int maxAreaT(int[] height){
        int len = height.length;
        if (len < 2) {
            return 0;
        }

        int left = 0;
        int right = len - 1;

        int res = 0;
        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            res = Math.max(res, minHeight * (right - left));

            if (height[left] == minHeight) {
                left++;
            } else {
                right--;
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxAreaT(height));
    }
}
