class Solution {
    public String countAndSay(int n) {
        if(n==1)
        {return "1";}
        String sam="1";
        while(n>1){
            StringBuilder curr= new StringBuilder();
            for(int i=0;i<sam.length();i++)
            {
                int count=1;
                while(i<sam.length()-1 &&sam.charAt(i)==sam.charAt(i+1))
                {
                    ++count;
                    ++i;
                }
                curr=curr.append(count).append(sam.charAt(i));
                
            }
            n--;
            sam=curr.toString();
        }
        return sam;
        
    }
}
