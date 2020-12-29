class Solution {
    public int reverse(int x) {
       
		
		boolean flag=false;
		if(x<0)
		{
			flag=true;
			x=x*(-1);
		}
		long b=0;
		while(x>0)
		{
			b=(b*10)+(x%10);
			x=x/10;

		}
		if(b>Integer.MAX_VALUE)
		{
			return 0;
		}
		return flag?((int)b)*(-1):(int)b;
	}
        
    }
