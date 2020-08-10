package exercise.leetcode;


/**
 * 滚动数组 +动态规划  打家劫舍  相邻两个不能相加
 * 偷窃第 k 间房屋，那么就不能偷窃第 k-1 间房屋，偷窃总金额为前 k−2 间房屋的最高总金额与第 k 间房屋的金额之和。
 * 不偷窃第 k 间房屋，偷窃总金额为前 k-1 间房屋的最高总金额。
 * 方程：
 * dp[i]=max(dp[i−2]+nums[i],dp[i−1])
 * <p>
 * 每多一间房  算最新的这间房+往前隔一个 前面几个房间的最大值    和 dp[i-1] 做比较  因为dp[i-1] 是截止到前一间房的最大值
 * <p>
 * <p>
 * 时间复杂度O(n)
 * 空间复杂度O(1)
 */
public class DaJiaJieShe {

    public static void main(String[] args) {

        int[] nums = {7, 1, 3, 4, 8, 8};
        DaJiaJieShe dj = new DaJiaJieShe();
        int a = dj.rob(nums);
        System.out.println(a);
    }

    //时间复杂度O(n) 空间复杂度O(1)
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int length = nums.length;
        int[] dp = new int[length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < length; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[length - 1];
    }


}
