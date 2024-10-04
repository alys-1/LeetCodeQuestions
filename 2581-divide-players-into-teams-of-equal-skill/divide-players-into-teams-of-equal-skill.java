class Solution {
    public long dividePlayers(int[] skill) {
        int n = skill.length;
        Arrays.sort(skill);
        long ts = skill[0] + skill[n - 1];
        long sum = 0;
        for(int i = 0; i < n/2; i++){
            if(skill[i] + skill[n - i - 1] != ts){
                return -1;
            }
        sum += skill[i] * skill[n-i-1];
        }
        return sum;
    }
}