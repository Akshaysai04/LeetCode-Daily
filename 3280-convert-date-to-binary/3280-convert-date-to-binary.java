class Solution {
    public String convertDateToBinary(String date) {
        String[] a=date.split("-");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<a.length;i++)
        {
            int num=Integer.parseInt(a[i]);
            sb.append(Integer.toBinaryString(num));
            if(i!=a.length-1) sb.append("-");
        }
        return sb.toString();
    }
}