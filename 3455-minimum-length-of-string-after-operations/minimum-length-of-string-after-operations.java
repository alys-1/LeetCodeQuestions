class Solution {
    public int minimumLength(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        char[] arr = s.toCharArray();
        int count = s.length();

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
            if (hm.get(arr[i]) > 2 && hm.get(arr[i]) % 2 == 1) {
                count -= 2; 
            }
        }

        return count;
    }
}
