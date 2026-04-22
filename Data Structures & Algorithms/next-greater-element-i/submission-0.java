class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
		Stack<Integer> stack = new Stack<>();
		Map<Integer,Integer> map = new HashMap<>();
		int n = nums2.length;

		for (int i = n-1; i >=0 ; i--) {

			int num = nums2[i];
			// check the small
			while (!stack.isEmpty() && num >= stack.peek()){
				stack.pop();
			}

			int nxtGreater = stack.isEmpty() ? -1 : stack.peek();
			map.put(num,nxtGreater);
			
			stack.push(nums2[i]);
		}

		for (int i = 0; i < nums1.length; i++) {
			ans[i] = map.get(nums1[i]);
		}
		
		return ans;
    }
}