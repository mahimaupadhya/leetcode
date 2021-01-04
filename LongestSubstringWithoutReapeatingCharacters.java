class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> h=new HashSet<Character>();
        int a=0;
        int j=0;int maxi=0;
        while(j<s.length())
        {
            if(!h.contains(s.charAt(j)))
            {
                h.add(s.charAt(j));
                j++;
                maxi=Math.max(h.size(),maxi);
                
            }
            else{
                    h.remove(s.charAt(a));
                    a++;
                }
        }
        return maxi;
    }
}
