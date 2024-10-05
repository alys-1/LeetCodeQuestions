class Solution {
    public long pickGifts(int[] gifts, int k) {
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    for(int i = 0; i< gifts.length; i++){
        pq.add(gifts[i]);
    }
    for(int i = 0; i< k; i++){
       int a =  pq.poll();
       int roota =(int) Math.pow(a, 0.5);
       pq.add(roota);
    }
    long sum = 0;
    while(!pq.isEmpty()){
        sum+=pq.poll();
        

    }  
    return sum;
    }
}