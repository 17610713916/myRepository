package exercise.leetcode;

import com.mchange.v2.lang.ObjectUtils;

public class ReverseInt {

    public static void main(String[] args) {
        int x= 1534236469;
        int out = reverse(x);
        System.out.println(out);
    }

    public static int reverse(int x){
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            //判断整数是否越界
//            int flag = rev> Integer.MAX_VALUE/10?0:1;
//            System.out.println(flag);
//            System.out.println(rev);
//            System.out.println(Integer.MAX_VALUE/10);
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE /10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE /10|| (rev == Integer.MIN_VALUE /10  && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;

    }

}
