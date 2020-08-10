package com.mozat.test;

public class ReverseStringTest {
//    //***************String method reverse
//    public static void main(String[] args) {
//        ReverseStringTest reverseStringTest=new ReverseStringTest();
//        reverseStringTest.StringMethodReverse("quanquanaiyaoyao");
//
//    }
//
//    public String StringMethodReverse(String str){
//        String output=new String();
//        for (int i=str.length()-1;i>=0;i--){
//            output+=(str.charAt(i));
//        }
//        display(str,output);
//        return output;
//    }
//
//    public static void display(String input,String output){
//        System.out.println("input----"+input);
//        System.out.println("output------"+output);
//    }



/*    //StringBuilder method reverse
    public static void main(String[] args) {
        ReverseStringTest reverseStringTest=new ReverseStringTest();
        reverseStringTest.StringBuilderMethodReverse("quanquanaiyaoyao");
    }

    public String StringBuilderMethodReverse(String str){
        StringBuilder stringBuilder=new StringBuilder(str);
        String output=stringBuilder.reverse().toString();
        display(str,output);
        return output;
    }
    public static void display(String input,String output){
        System.out.println("input----"+input);
        System.out.println("output------"+output);
    }*/

/*    //subString method reverse
    public static void main(String[] args) {
        String str = "javaguides";
        // string is immutable
        str = reverse(str);
        System.out.println("Reverse of the given string is : " + str);
    }

    private static String reverse(String str) {
        if (str == null || str.equals(""))
            return str;
        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
    }*/

//    public static void main(String[] args) {
//        String str="haowq";
//        String a=recursion(str);
//        System.out.println(a);
//    }
//    public static String recursion(String str){
//        if (str==null || str.equals("")){
//            return "";
//        }
//        char[] chars=str.toCharArray();
//        recursionMethod(0,chars);
//        return String.copyValueOf(chars);
//    }
//    private static int i=0;
//    public static void recursionMethod(int index,char[] str){
//
//        if (index>=str.length){
//            return;
//        }
//
//
//        recursionMethod(index+1,str);
//        if (i <= index) {
//            char temp = str[index];
//            str[index] = str[i];
//            i++;
//            str[i++] = temp;
//        }

//        System.out.println("index:"+index+"-----i:"+i+"-----str[index]:"+str[index]+"----str[i]:"+str[i]+"----str[i++]:"+str[i++]);
//    }


}
