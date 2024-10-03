class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i < n; i++ ){
            for(int j = 0; j< n; j++){
                if(hs.contains(grid[i][j])){
                    list.add(grid[i][j]);
                }else{
                    hs.add(grid[i][j]);
                }
            }
        }
        for(int i = 1; i <= n * n; i++){
            if(!hs.contains(i)){
                list.add(i);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}