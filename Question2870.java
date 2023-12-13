//https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty
//Minimum number of operations to make Array Empty
import java.util.*;
public class Question2870 {
    public static int minOperations(int[] nums) {
        int n = nums.length;
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> set : map.entrySet()){
            int c = set.getValue();
            if(c<2){
                return -1;
            }else{
                count+=fun(c);
            }
        }
        return count;
    }
    public static int fun(int val){
        int ans = val/3;
        if(val%3!=0){
            ans++;
        }
        return ans;
    }
}
