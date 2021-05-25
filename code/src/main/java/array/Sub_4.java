package main.java.array;

/**
 * 以数组中的困难级别题，leetcode第4题作为开始
 * 原题：
 *      给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 */
public class Sub_4 {
    public static void main(String[] args) {
        int[] ns1={1,3};
        int[] ns2={2,4};
        System.out.println(findMedianSortedArrays(ns1,ns2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int index1 = 0;
        int index2 = 0;
        int index = 0;
        double result = 0d;
        int[] array = new int[nums1.length+nums2.length];

        compare(nums1, nums2, index1, index2, index, array);

        if(0==array.length%2){
            int middleIndex = array.length/2-1;
            result = (array[middleIndex]+array[middleIndex+1])/2.0;
        }else {
            result = array[array.length/2];
        }

        return result;
    }

    private static void compare(int[] nums1, int[] nums2, int index1, int index2, int index, int[] array) {
        if(index==nums1.length+nums2.length)
            return;
        if(index1<nums1.length&&index2<nums2.length){
            if(nums1[index1]< nums2[index2]){
                array[index++] = nums1[index1++];
            }else{
                array[index++] = nums2[index2++];
            }
        }else if(index1<nums1.length){
            array[index++] = nums1[index1++];
        }else if(index2<nums2.length){
            array[index++] = nums2[index2++];
        }
        compare(nums1, nums2, index1, index2, index, array);
    }
}
