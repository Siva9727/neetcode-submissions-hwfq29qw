class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length == 0) return 0;

        Set<Integer> seen = new HashSet<>();
        for(int i : nums){
            seen.add(i);
        }

        int maxLen = 0;

        for(int num : seen){
            if(!seen.contains(num-1)){
                int curr = num;
                int len = 1;

                while(seen.contains(curr+1)){
                    curr++;
                    len++;
                }

                maxLen = Math.max(maxLen,len);
            }
        }

        return maxLen;
    }
}
