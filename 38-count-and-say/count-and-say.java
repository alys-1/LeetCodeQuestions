class Solution {
    public String countAndSay(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append("1");
        while(n-- > 1){
            StringBuilder sb2 = new StringBuilder();
            char c = sb.charAt(0);
            int freq = 1;
            int idx =  1;
            while(idx < sb.length()){
                if(sb.charAt(idx) == c){
                    freq++;
                }else{
                    sb2.append(freq);
                    sb2.append(c);
                    freq =1 ;
                    c = sb.charAt(idx);
                }
                idx++;
            }
            sb2.append(freq);
            sb2.append(c);
            sb = sb2;
        }
        return sb.toString();
    }
}