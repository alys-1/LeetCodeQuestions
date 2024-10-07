class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] clone = arr.clone();
        Arrays.sort(clone);
        Map<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int rank = 1;
        for(int i = 0; i< clone.length; i++){
            if(!hm.containsKey(clone[i])){
                hm.put(clone[i], rank);
                rank++;
            }
        }
        for(int i = 0; i< arr.length; i++){
            list.add(hm.get(arr[i]));
        }

        int[] res = new int[list.size()];
        for(int i = 0; i< list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
}