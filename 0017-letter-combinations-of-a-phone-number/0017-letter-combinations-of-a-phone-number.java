class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if(digits.length()==0){
            return ans;
        }
        Map<Character,String> digi=new HashMap<>();
        digi.put('2',"abc");
        digi.put('3',"def");
        digi.put('4',"ghi");
        digi.put('5',"jkl");
        digi.put('6',"mno");
        digi.put('7',"pqrs");
        digi.put('8',"tuv");
        digi.put('9',"wxyz");
        backtrack(digits,0,new StringBuilder(),ans,digi);
        return ans;
    }
    private void backtrack(String digit,int idx,StringBuilder comb,List<String> res,Map<Character,String> digi){
        if(idx == digit.length())
        {
            res.add(comb.toString());
            return;
        }
        String letters=digi.get(digit.charAt(idx));
        for(char letter:letters.toCharArray())
        {
            comb.append(letter);
            backtrack(digit,idx+1,comb,res,digi);
            comb.deleteCharAt(comb.length()-1);
        }
    }

}