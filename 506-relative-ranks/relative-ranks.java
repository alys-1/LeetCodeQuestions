class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] arr = score.clone();
        Arrays.sort(arr);

        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            hm.put(arr[i], arr.length - i );
        }

        String[] res = new String[arr.length];
        for(int i = 0; i < score.length; i++){
            if(hm.get(score[i])== 1){
                res[i] = "Gold Medal";
            }else if(hm.get(score[i])== 2){
                res[i] = "Silver Medal";
            }else if(hm.get(score[i])== 3){
                res[i] = "Bronze Medal";
            }else{
                res[i] = hm.get(score[i]).toString();
            }
        }
        return res;
    }
}