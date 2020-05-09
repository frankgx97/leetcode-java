class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            hashmap.put(nums[i],i);
        }
        for (int i=0;i<nums.length;i++){
            if (hashmap.containsKey(target - nums[i]) && hashmap.get(target - nums[i]) != i){
                return new int[] {i, hashmap.get(target - nums[i])};
            }
        }
        return new int[] {};
    }
}
