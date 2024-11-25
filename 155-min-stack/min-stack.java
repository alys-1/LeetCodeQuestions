class MinStack {
    ArrayList<Integer> ar;
    ArrayList<Integer> m;
    int size = 0;

    public MinStack() {
       ar = new ArrayList<>();
       m = new ArrayList<>();
    }
    
    public void push(int val) {
        ar.add(val);
        if(size == 0){
            m.add(val);
        }else{
            m.add(Math.min(val, m.get(size-1)));
        }
        size++;
    }
    
    public void pop() {
        if(size > 0){
            m.remove(size - 1);
            ar.remove(size - 1);
            size--;
        }
    }
    
    public int top() {
        if(size > 0){
            return ar.get(size - 1);
        }
        return -1;
    }
    
    public int getMin() {
        if(size > 0){
            return m.get(size-1);
        }
        return -1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */