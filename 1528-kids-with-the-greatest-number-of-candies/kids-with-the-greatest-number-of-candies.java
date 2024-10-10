class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> arr = new ArrayList<>();
        for(int i = 0; i< candies.length; i++){
            Boolean canHave = true;
            for(int j = 0; j < candies.length; j++){
            if(candies[i] + extraCandies < candies[j]){
                canHave = false;
                break;
            }
           
            }
            arr.add(canHave);
        }
        return arr;
    }
}