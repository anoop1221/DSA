//https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/
import java.util.*;
public class Question1464 {
    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }

    public static void main(String[] args) {
        int[] nums = {1,5,4,5};
        System.out.println(maxProduct(nums));
    }
}
