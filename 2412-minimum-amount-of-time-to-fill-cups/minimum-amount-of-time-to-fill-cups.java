class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < amount.length; i++ ){
            pq.add(amount[i]);
        }
        int count = 0;
    while(pq.peek() != 0){
        int a = pq.poll();
        int b = pq.poll();
        pq.add(a - 1);
        pq.add(b - 1);
        count++;
    }
    return count;
}
}

