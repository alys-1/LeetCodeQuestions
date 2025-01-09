class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();

        for(int i = 0; i < words.length; i++){
            String word = words[i];
            for(int j = 0; j < words.length; j++){
                if(i != j && !res.contains(words[j]) && word.contains(words[j])){
                    res.add(words[j]);
                }
            }
        }
        return res;
    }
}