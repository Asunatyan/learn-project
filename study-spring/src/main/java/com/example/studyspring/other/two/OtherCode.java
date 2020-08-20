package com.example.studyspring.other.two;

public class OtherCode {
    public static void main(String[] args) {
        //1 2 4 16
        //0 1 2

        String x = Integer.toBinaryString(20);
        System.out.println(Integer.parseInt(x, 2));
        System.out.println(x);
        System.out.println("------------------------");
        /*String[] str_string = "12345".split("");
        System.out.println(Arrays.toString(str_string));
        char[] x1 = "123".toCharArray();*/
        char[] chars = x.toCharArray();

        for (int i = 1; i <= chars.length; i++) {
            int i1 = Integer.parseInt(String.valueOf(chars[i-1]));
            if (i1 == 1) {
                System.out.println((1<<i)/2);
            }
        }
        System.out.println("------------------------");
        System.out.println(Integer.toBinaryString(7));
        System.out.println(Integer.toBinaryString(3));
        System.out.println(Integer.toBinaryString(20));
        System.out.println(Integer.toBinaryString(15));
        System.out.println(Integer.toBinaryString(12));
        System.out.println(Integer.toBinaryString(23));

    }
}





