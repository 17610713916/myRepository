package exercise.leetcode;

public class MaxArea {

    public static void main(String[] args) {
        int[] height=new int[]{8,6,2,3,15,3,7,5,1};
        final int out = doublePointerMaxArea(height);
        System.out.println(out);
    }

    //暴力解法  时间复杂度O（n^2） 空间复杂度O(1)
    public static int maxArea(int[] height){
        int maxArea=0;
        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < height.length; j++) {
                maxArea = Math.max(maxArea,Math.min(height[i],height[j])*(j-i));
            }
        }
        return maxArea;
    }

    //双指针 时间复杂度O(n) 空间复杂度：O（1）
    public static int doublePointerMaxArea(int[] height){
        int left=0;
        int right=height.length-1;
        int maxArea=0;
        while (left<right){
            maxArea=Math.max(maxArea,Math.min(height[left],height[right])*(right-left));
            if (height[left]<height[right]){
                left++;
            }else {
                right--;
            }
        }
        return maxArea;
    }

}
