package BinarySubarraysWithSum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int numSubarraysWithSum(int[] A, int S) {
        List<Integer> su = new ArrayList<Integer>();
        su.add(0);
        for (int i:A){
            su.add(su.get(su.size() - 1) + i);
        }

        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int i:su){
            if(map.containsKey(i)){
                ans += map.get(i);
            }
            if (map.containsKey(i+S)){
                map.put(i+S,map.get(i+S)+1);
            }else{
                map.put(i+S,1);
            }
        }
        return ans;

    }
}