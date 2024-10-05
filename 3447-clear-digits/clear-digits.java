class Solution {
    public String clearDigits(String s) {
        char arr[] = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            if(Character.isDigit(arr[i])){
               st.pop(); 
            }else{
                st.push(arr[i]);
            }
        }
       StringBuilder sb = new StringBuilder();
       while(!st.isEmpty()){
       char a = st.pop();
       sb.append(a); 
       }
       return sb.reverse().toString();
    }
}