class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) != '*'){
                st.push(s.charAt(i));
            }else if (!st.isEmpty()) {
                    st.pop();
                }
        }
        StringBuilder result = new StringBuilder();
        for (Character c : st) {
            result.append(c);
        }
        
        return result.toString();
    }
}