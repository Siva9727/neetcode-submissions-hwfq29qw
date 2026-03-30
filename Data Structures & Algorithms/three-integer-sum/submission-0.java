class Solution {
     public List<List<Integer>> threeSum(int[] nums) {
        
        // sort the array
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0; i< nums.length-2; i++){
            //check duplicates 
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }

            // two pointer 
            int left = i+1;
            int right = nums.length-1;

            while(left< right){
                // sum
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0){
                    ans.add(Arrays.asList(nums[i],nums[left], nums[right]));

                    // skip left and right duplicates
                    while(left<right && nums[left] == nums[left+1]){
                        left++;
                    }

                    while(left<right && nums[right]==nums[right-1]){
                        right--;
                    }

                    // move both inward 
                    left++;
                    right--;

                }
                else if(sum < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return ans;
    }
}
