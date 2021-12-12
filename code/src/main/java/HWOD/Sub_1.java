package main.java.HWOD;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 给定一个字符串，分割子串，
 * 使每个子串的ASCII码的和均为水仙花数，
 * 若能，返回子串个数，
 * 若不能，返回0，
 * 若存在多种分割方式，返回-1。
 *
 * 分析：
 * 首先分解问题为【若能，记录子串】
 */
public class Sub_1 {
    public static void main(String[] args) {
        String s = "tynb";
        int sum1 = s.chars().sum();
        char[] arr = s.toCharArray();
        int sum2 = 0;
        for(char ch :arr){
            sum2+=(int)ch;
        }
        System.out.println(sum1);
        System.out.println(sum2);
        Map<String,Integer> map = new ConcurrentHashMap<>();
    }
}
