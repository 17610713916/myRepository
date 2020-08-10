package com.mozat.test;

public class EnumClass {
    public static void main(String[] args) {
        FreshJuice juice=new FreshJuice();
        juice.size=FreshJuice.FreshJuiceSize.SMALL;
    }

}
class FreshJuice {
    enum FreshJuiceSize{ SMALL, MEDIUM , LARGE }
    FreshJuiceSize size;
}

