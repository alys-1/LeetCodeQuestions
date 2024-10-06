class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i< arr.length; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);

        }
        ArrayList<Integer> l = new ArrayList<>();
        for(int c: hm.values() ){
            if(l.contains(c)){
                return false;
            }
            else{
                l.add(c);
            }
        }
        return true;
    }
}