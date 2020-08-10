package exercise.leetcode;

import java.util.HashMap;
import java.util.Map;

public class liangshuzhihe {

    public static void main(String[] args) {
        int[] nums={1,2,5,4,5};
        int target=6;

        liangshuzhihe aa=new liangshuzhihe();
        int[] result=aa.twoSum(nums,target);
        for (int i=0;i<result.length;i++){
            System.out.println(nums[result[i]]);
        }
    }
    //时间复杂度 O(n2)  遍历多遍 第一个for每个下标 遍历一遍整个数据所以是n2
    public int[] twoSum(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==target-nums[i]){
                    return new int[]{j,i};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    //时间复杂度 O(n) 遍历两遍 hash表  空间复杂度O(n)
    public int[] twoSumOn(int[] nums,int target){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int result=target-nums[i];
            //如果map中包含该值 并且不等于nums[i] 它本身 就返回
            if(map.containsKey(result) && map.get(result)!=i){
                return new int[]{i,map.get(result)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    //时间复杂度 O(1) 遍历一遍 空间复杂度O（n）
    public int[] twoSumO1(int[] nums,int target){

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");


    }


}
