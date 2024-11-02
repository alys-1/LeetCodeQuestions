class Solution {
    public boolean isCircularSentence(String sentence) {
        int k = sentence.indexOf(" ");
        if(sentence.charAt(0) != sentence.charAt(sentence.length() - 1)){
            return false;
        }
        while(k != -1){
            if(sentence.charAt(k-1) != sentence.charAt(k+1)){
                return false;
            }
            k = sentence.indexOf(" ", k+1);
        }
        return true;
    }
}