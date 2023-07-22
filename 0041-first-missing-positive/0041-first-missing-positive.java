class Solution {
    public int firstMissingPositive(int[] nums) {
        
        HashSet<Integer> hs=new HashSet<>();
        long max=1;
        for(int i=0; i < nums.length; i++){
            hs.add(nums[i]);
            max=Math.max(nums[i],max);
        }
        
        for(int i=1; i <= max+1; i++){
            if(!hs.contains(i)){
                return i;
            }
        }
        return -1;
        
        
    }
}