package main.java.array;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int nums[] = {0,55,2,34,22,23,6,26,88,70,1};

        quickSort(nums);

        System.out.println(Arrays.toString(nums));

    }

    private static void quickSort(int[] nums) {

        for(int i = 0 , j = nums.length - 1 ; j > 0 && i < nums.length - 1 ; i++ ,j--){
            if( nums[i] >= nums[j] ){


            }
        }
    }

}
