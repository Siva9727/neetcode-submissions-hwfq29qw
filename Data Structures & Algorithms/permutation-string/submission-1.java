class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] c = s1.toCharArray();
        Arrays.sort(c);
        String sortedS = new String(c);

        for(int i=0; i<s2.length(); i++){
            for(int j=i; j<s2.length(); j++){
                char[] subArray = s2.substring(i,j+1).toCharArray();
                Arrays.sort(subArray);
                String sortedSubStr = new String(subArray);

                if(sortedSubStr.equals(sortedS) ){
                    return true;
                }
            }
        }

        return false;
    }
}
