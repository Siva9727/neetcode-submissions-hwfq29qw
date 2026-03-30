class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> count = new HashMap<>();

        int left=0;
        int res=0;
        int maxFreq= 0;

        for(int right=0; right<s.length(); right++){
            // first add the char to hashmap and update the count
            count.put(s.charAt(right), count.getOrDefault(s.charAt(right), 0) + 1);

            maxFreq = Math.max(maxFreq, count.get(s.charAt(right)));

            if(((right - left + 1) - maxFreq) > k ){
                
                count.replace(s.charAt(left), count.get(s.charAt(left))-1);
                left++;
            }

            res = Math.max(res, right - left + 1);
        }

        return res;

    }
}
