class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();
        for(int i = 0; i< s.length(); i++){
            if(!st.isEmpty() && arr[i] == 'B' && st.peek() == 'A' ){
                
                    st.pop();
                
            }
            else if(!st.isEmpty() && arr[i] == 'D' && st.peek() == 'C'){
                
                    st.pop();
                
            }
            else{
                st.push(arr[i]);
            }
        }
        return st.size();
    }
}