class Solution {
    public String reverseStr(String s, int k) {
        char ch[]=s.toCharArray();
        int n=s.length();
        for(int i=0; i<n;i+=2*k){
            int l=i;
            int r=Math.min(i+k-1,n-1);
            while(l<r){
            char temp=ch[l];
            ch[l]=ch[r];
            ch[r]=temp;
            l++;
            r--;
        }
        }
       
        String str=new String(ch);
        return str;
        
    }
}