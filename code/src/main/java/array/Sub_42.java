package main.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 *
 * 输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * 输出：6
 * 解释：上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/trapping-rain-water
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Sub_42 {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int highest  = Arrays.stream(arr).max().getAsInt();
        System.out.println(highest);
        int target = highest;
        List<Integer> indexList = new ArrayList<>();
        for(int index = 0; index < arr.length; index++ ){
            if(arr[index]==target){
                indexList.add(index);
            }
        }

    }
}
