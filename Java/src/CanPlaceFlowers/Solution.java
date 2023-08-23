package CanPlaceFlowers;

public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean result = false;
        int len = flowerbed.length;

        for(int i = 0; i< len; i++){
            if(flowerbed[i] == 0 &&
                    ((i == 0) || (flowerbed[i-1] == 0 )) &&
                    ((i == (len-1)) || flowerbed[i+1] == 0)){
                flowerbed[i] = 1;
                n--;
            }
            if(n<=0){
                result = true;
                break;
            }
        }
        return result;
    }
}
