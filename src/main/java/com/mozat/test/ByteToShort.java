package com.mozat.test;

public class ByteToShort {


    public static void main(String[] args) {
        byte[] bb=new byte[5];
        short[] aa=toShortArray(bb);
        System.out.println(aa);
    }

    public static short[] toShortArray(byte[] src) {
        int count = src.length >> 1;
        short[] dest = new short[count];
        for (int i = 0; i < count; i++) {
            dest[i] = (short) (src[i * 2] << 8 | src[2 * i + 1] & 0xff);
        }
        return dest;
    }

}
