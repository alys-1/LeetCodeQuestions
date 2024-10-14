class Solution {
    public int maxDepth(String s) {
       int ans = 0;
       int count = 0; 
       Stack<Character> st = new Stack<>();
       for(int i = 0; i < s.length(); i++){
        if(s.charAt(i) == '('){
            count++;
        }else if(s.charAt(i) == ')'){
            count--;
        }
        ans = Math.max(ans, count);
       }
       return ans;
    }
}