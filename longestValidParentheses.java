class Solution {
    public int longestValidParentheses(String s) {
        if(s==""){return 0;};
        if(s.length()==1){return 0;}
        Stack<Character> stack= new Stack<Character>();
        Stack<Integer> stack2= new Stack<Integer>();
        stack2.push(-1);
        int length=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                stack.push(s.charAt(i));
                stack2.push(i);
            }
            else{
                if(stack.isEmpty()==false)
                {
                    stack.pop();
                    stack2.pop();
                    int x= i-stack2.peek();
                    length=Math.max(length,x);
                }
                else{
                    stack2.push(i);
                }
            }

        }
        return length;
      
        
}}
