class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] arr1 = s1.split("\\s+");
        String[] arr2 = s2.split("\\s+");
        ArrayList<String> l = new ArrayList<>();
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i = 0; i< arr1.length; i++){
            hm.put(arr1[i], hm.getOrDefault(arr1[i], 0) + 1);
        }
        for(int i = 0; i< arr2.length; i++){
            hm.put(arr2[i], hm.getOrDefault(arr2[i], 0) + 1);
        }
        for(int i = 0; i < arr1.length; i++){
            if(hm.get(arr1[i])== 1){
                l.add(arr1[i]);
            }
        }
        for(int i = 0; i < arr2.length; i++){
            if(hm.get(arr2[i])== 1){
                l.add(arr2[i]);
            }
        }
        String[] res = new String[l.size()];
        for(int i = 0; i< l.size(); i++){
            res[i] = l.get(i);
        }
        return res;
    }
}