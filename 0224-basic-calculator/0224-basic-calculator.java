class Solution {
    public int calculate(String s) {
        Stack<Integer> a=new Stack<>();
        int result=0;
        int num=0;
        int sign=1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9'){
             num=num*10+(ch-'0');

            }else if(ch=='+'){
                result+=sign*num;
                num=0;
                sign=1;
    
            }else if(ch=='-'){
                result+=sign*num;
                num=0;
                sign=-1;
            }
            else if(ch=='('){
                a.push(result);
                a.push(sign);
                result=0;
                sign=1;
        
            }
            else if(ch==')'){
                result+=sign*num;
                result*=a.pop();
                result+=a.pop();
                num=0;
            }
        }
        result+=sign*num;
        return result;

    }
}