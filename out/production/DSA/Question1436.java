package out.production.DSA;
//https://leetcode.com/problems/destination-city/?envType=daily-question&envId=2023-12-15
import java.util.*;
public class Question1436 {
    public static String destCity(List<List<String>> list) {
        HashMap<String,Integer> map = new HashMap<>();
        int n = list.size();
        for(int i=0;i<n;i++){
            map.put(list.get(i).get(0),0);
        }
        for(int i=0;i<n;i++){
            if(!map.containsKey(list.get(i).get(1))){
                return list.get(i).get(1);
            }
        }
        return "";
    }

    public static void main(String[] args) {

    }
}
