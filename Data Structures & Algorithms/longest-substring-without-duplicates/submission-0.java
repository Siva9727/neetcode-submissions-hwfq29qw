class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        Set<Character> set = new HashSet<>();
        int res = 0;

        for(int r = 0; r< s.length() ; r++){
            // find the char already in set 
            while(set.contains(s.charAt(r))){
                // remove the char at left  position in set 
                set.remove(s.charAt(l));
                // and update left pointer
                l++;
            }

            // else
            //add the char to set 
            set.add(s.charAt(r));
            res = Math.max(res, r-l+1);

        }

        return res;
    }
}
