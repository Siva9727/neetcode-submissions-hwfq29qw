class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        StringBuilder s = new StringBuilder();
        while(i<word1.length() && j< word2.length()){
            
            s.append(word1.charAt(i++));
            s.append(word2.charAt(j++));
        }

        s.append(word1.substring(i));
        s.append(word2.substring(j));

        return s.toString();
    }
}