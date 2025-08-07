class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> a=new Stack<>();
        for(String d:operations){
         
            if(d.equals("C")){
                a.pop();
            }
            else if(d.equals("D")){
                
                a.push(2*a.peek());
            }
            else if(d.equals("+")){
                int last=a.pop();
                int f=a.peek();
                a.push(last);
                a.push(last+f);
            }else {
                a.push(Integer.parseInt(d));
            }

        }
        int o=0;
        for(int i:a){
            o+=i;
        }
        return o;
    }
}





