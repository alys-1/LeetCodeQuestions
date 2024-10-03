class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int asum = 0;
        for(int i = 0; i < aliceSizes.length; i++){
            asum+= aliceSizes[i];
        }
        int bsum = 0;
        for(int i = 0; i < bobSizes.length; i++){
            bsum+= bobSizes[i];
        }
        int [] res = new int[2];
        //swap
        for(int i : aliceSizes ){
            for(int j : bobSizes){
                if(asum + j - i == bsum - j + i ){
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;

    }
}