class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] left=new int[n];
        int[] right=new int[n];
        // Arrays.fill(left,1);
        // Arrays.fill(right,1);
        int temp1=0;
        for(int i=0;i<height.length;i++){
               left[i] =Math.max(temp1,height[i]);
               temp1 = Math.max(temp1,height[i]);
        }
        int temp2=0;
        for(int i=height.length-1;i>=0;i--){
            right[i] =Math.max(temp2,height[i]);
            temp2 = Math.max(temp2,height[i]);
        }
        int[] resultant=new int[n];
        for(int i=0;i<n;i++){
            if(left[i]<right[i]){
                resultant[i]=left[i];
            }
            else{
                resultant[i]=right[i];
            }
        }
        int preservedWater=0;
        int i=0;
        while(i<n){
            preservedWater+=resultant[i]-height[i];
            i++;
        }
        return preservedWater;
    }
}
