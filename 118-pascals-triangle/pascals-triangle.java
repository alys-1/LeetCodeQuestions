class Solution {
    public List<List<Integer>> generate(int rows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
               
                temp.add(nCr(i,j));
            }
            result.add(temp);
            
        }  
        return result;
    }
    public static int nCr(int n, int r) {
    int res = 1;
    for (int i = 0; i < r; i++) {
        res = res * (n - i) / (i + 1);
    }
    return res;
    }

}