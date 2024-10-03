import java.util.HashSet;

class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        HashSet<Integer> hs = new HashSet<>();
        
        for (int candy : candyType) {
            hs.add(candy);
        }
        
        return Math.min(hs.size(), n / 2);
    }
}
