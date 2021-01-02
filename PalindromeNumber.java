class Solution {
    public boolean isPalindrome(int x) {
        if(x==0){return true;}
		
		if(x<0 || x%10==0)
		{
			return false;
		}
        
		int b=0;
		while(x>b)
		{
			b=(b*10)+(x%10);
			x=x/10;

		}
		if(x==b || x==b/10)
			{return true;}
		else{
			return false;
		}
        
        
    }
}
