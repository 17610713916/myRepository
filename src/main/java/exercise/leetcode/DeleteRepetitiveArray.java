package exercise.leetcode;

public class DeleteRepetitiveArray {

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,2,3};
        int out=removeRepetitiveArray(nums);
        System.out.println(out);
    }


    public static int removeRepetitiveArray(int[] nums){
        if (nums.length==0){
            return 0;
        }
        int i = 0;
        for (int j =1;j<nums.length;j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i]=nums[j];
            }

        }
        return i+1;
    }


}
