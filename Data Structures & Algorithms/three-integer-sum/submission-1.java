class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // set the return 

        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        // to use two pointer , first we have to sort the array 
        Arrays.sort(nums);

        for(int i=0; i< n-2; i++){
            // we have to skip the already calculated triplets
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            //start the two pointer approach 
            int l = i+1;
            int r = n-1;

            while(l<r){
                int sum = nums[i]+nums[l]+nums[r];

                if(sum == 0){
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                        l++;
                        r--;
                    // need to skip the same numbers for unique               
                    while (l < r && nums[l] == nums[l - 1]) l++;
                    while (l < r && nums[r] == nums[r + 1]) r--;
                }
                else if(sum > 0){
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        return res;
    }
}
