class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=0;
        for(int i=0;i<piles.length;i++){
            r=Math.max(r,piles[i]);
        }
        int minhr=0;
        while(l<=r){
            int  mid=l+(r-l)/2;
            int  currenHour=0;
            for(int i=0;i<piles.length;i++){
                currenHour+=Math.ceil((double)piles[i]/mid);
            }
            if(currenHour<=h){
                minhr=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return minhr;
    }
}
