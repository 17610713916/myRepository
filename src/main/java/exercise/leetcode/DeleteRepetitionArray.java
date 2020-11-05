package exercise.leetcode;

import java.util.Arrays;

public class DeleteRepetitionArray  {


    public static void main(String[] args) {
        int[] nums=new int[]{1,1,2,2,3};
        DeleteRepetitionArray dra=new DeleteRepetitionArray();
        int out = dra.deleteRepetition(nums);
        System.out.println(out);
    }
    public int deleteRepetition(int[] nums){
        if (nums.length==0){
            return 0;
        }
        int i =0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }


}
