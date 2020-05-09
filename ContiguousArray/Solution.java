import java.util.*;

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, List<Integer>> p = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        list.add(0);
        p.put(0,list);
        int n=1;
        int last = 0;
        for (int num : nums) {
            int curr;
            if (num == 0) {
                curr = last - 1;
            } else {
                curr = last + 1;
            }
            if (!p.containsKey(curr)) {
                p.put(curr, new ArrayList<Integer>(Arrays.asList(n)));
            } else {
                List<Integer> currl = p.get(curr);
                currl.add(n);
                p.replace(curr, currl);
            }
            n++;
            last = curr;
        }
        int mx = 0;
        for(Map.Entry<Integer,List<Integer>> entry: p.entrySet()){
            mx = Math.max(mx, Collections.max(entry.getValue()) - Collections.min(entry.getValue()));
        }
        return mx;
    }
}