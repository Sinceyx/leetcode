package main.java.array;

/**
 * 给你一个未排序的整数数组 nums ，请你找出其中没有出现的最小的正整数。
 *
 * 请你实现时间复杂度为 O(n) 并且只使用常数级别额外空间的解决方案。
 */
public class Sub_41 {
    /**
     * 分析，这题的难度主要在于时间复杂度的要求和空间的要求。
     */
    public static void main(String[] args) {
        String s = "hello";
        String t = "hello";
        char c[]= {'h','e','l','l','o'};
        System.out.println(s.equals(t));
        System.out.println(t.equals(c));
        System.out.println(s==t);
        System.out.println(t.equals(new String("hello")));
    }
    public static int firstMissingPositive() {
        short a = 128;
        byte b = (byte) a;
        System.out.println(b);
        return 0;
    }


}
