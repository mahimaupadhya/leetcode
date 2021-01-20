class Solution {
    public int romanToInt(String s) {
        if(s==""){return 0;}
        if(s.length()==1)
        {
            return check(s.charAt(0));
        }
        int i;
        int f=-0;    //MCMXCIV
       // iv
        for( i=0;i<s.length()-1;i++)
        {
            System.out.print(check(s.charAt(i))<check(s.charAt(i+1)));
            
            if(check(s.charAt(i))<check(s.charAt(i+1)))
            {
                f+=-check(s.charAt(i));
                System.out.print(check(s.charAt(i)));
                
                
                
            }
            else
            {
                f+=check(s.charAt(i));
                System.out.print(f);
                
                
            }   
        }
        
        System.out.print(f);
      return (f+check(s.charAt(i)));      
        
    }
    public int check(char roman)
    {
        if(roman=='I'){return 1;}
        else if(roman=='V'){return 5;}
        else if(roman=='X'){return 10;}
        else if(roman=='L'){return 50;}
        else if(roman=='C'){return 100;}
        else if(roman=='D'){return 500;}
        else if(roman=='M'){return 1000;}
        return 0;
    }
