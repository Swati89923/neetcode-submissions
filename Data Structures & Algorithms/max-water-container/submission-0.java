class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int maxWater=0;
        while(left<=right){
            int currentWater= Math.min(heights[left],heights[right])*(right-left);
            if(currentWater>maxWater){
                maxWater=currentWater;
            }
            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxWater;
    }
}
