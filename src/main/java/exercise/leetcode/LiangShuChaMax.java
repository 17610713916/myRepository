package exercise.leetcode;

/**
 * 这个案例是给一个数组，类似于买股票，先买后卖，不能先卖后买，所以只能依次从左到右观察，看后面的那个数减前面的数相差最大
 */
public class LiangShuChaMax {

    public static void main(String[] args) {
        int[] arr={2,5,3,6,3,10};
        LiangShuChaMax lm=new LiangShuChaMax();
        int out=lm.maxProfit2(arr);
        System.out.println(out);
    }

    //这个方法相当于一个变量记录最小值，一个变量记录从[1]下标1开始减前面的最小值
    public int maxProfit(int[] prices) {
        if(prices.length <= 1)
            return 0;
        int min = prices[0], max = 0;
        for(int i = 1; i < prices.length; i++) {
            max = Math.max(max, prices[i] - min);
//            System.out.println(max);
            min = Math.min(min, prices[i]);
//            System.out.println(min);
        }
        return max;
    }
    //暴力法 遍历两次数组 复杂分析度下降 时间复杂度O(n2)  空间复杂度 O(1)

    public int maxProfit1(int[] arr){
        int maxProfit=0;
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int cha=arr[j]-arr[i];
                if (cha>maxProfit){
                    maxProfit=cha;
                }
            }
        }
        return maxProfit;
    }


    /**
     * 遍历一次 每次和minProfit变量作比较，如果小的话minProfit=arr[i]，大于minProfit 并且arr[i]-minProfit >maxProfit的话 maxProfit=arr[i]-minProfit
     * 时间
     * @param prices
     * @return
     */
        public int maxProfit2(int[] prices) {
            int minProfit=Integer.MAX_VALUE;
            int maxProfit=0;
            for(int i=0;i<prices.length;i++){
                if(prices[i]<minProfit){
                    minProfit=prices[i];
                }else if(minProfit-prices[i]>maxProfit){
                    maxProfit=minProfit-prices[i];
                }
            }
            return maxProfit;
        }



}
