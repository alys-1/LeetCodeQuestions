class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i< operations.length; i++){
            if(operations[i].equals("+")){
                int a = st.pop();
                int b = st.pop();
                int s = a+ b;
                st.push(b);
                st.push(a);
                st.push(s);
            }else if(operations[i] .equals("C")){
                st.pop();
            }else if(operations[i] .equals("D")){
                int p = st.pop();
                st.push(p);
                st.push(2 * p);
            }
            
            else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int sum = 0;
        while(!st.isEmpty()){
           sum += st.pop();
        }
        return sum;
    }
}