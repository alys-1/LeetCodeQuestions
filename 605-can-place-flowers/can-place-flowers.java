class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int canplant = 0;
        int l = flowerbed.length;
        if(l == 1 && flowerbed[0] == 0 && n == 1) return true;
        if(l == 1){
            if(flowerbed[0] == 0){
                flowerbed[0] = 1;
                canplant++;
            }
        }
        if(l > 1 && flowerbed[0] == 0){
            if(flowerbed[1] == 0){
                flowerbed[0] = 1;
                canplant++;
            }
        }
        for(int i = 1; i < l -1; i++){
            if(flowerbed[i-1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0){
                flowerbed[i] = 1;
                canplant++;
            }
        }
        if( l > 1 && flowerbed[l-1] == 0){
            if(flowerbed[l - 2] == 0){
                flowerbed[l - 2] = 1;
                canplant++;
            }
        }
        return canplant >= n;
    }
}