class Solution {
    public String longestPalindrome(String s) {
        
      		int len=s.length();
		boolean table[][]= new boolean[len][len];
		for(int i=0;i<len;i++)
		{
			table[i][i]=true;
		}
		int maxlength=1;
		int start=0;
		for(int i=0;i<len-1;i++)
		{
			if((s.charAt(i))==s.charAt(i+1))
			{
				table[i][i+1]=true;
				maxlength=2;
				start=i;
			}
		}
		for(int k=3;k<=len;k++)
		{
			for(int i=0;i<len-k+1;i++)
			{
				int j=i+k-1;
				if(s.charAt(i)==s.charAt(j) && table[i+1][j-1])
				{
					table[i][j]=true;
					if(k>maxlength)
					{
						maxlength=k;
						start=i;
					}

				}
			}
		}
		return(s.substring(start,start+maxlength));
	}  
    }
