class Solution {
    public int search(int[] nums, int target) {
        int min=findMin(nums);
        int k=binarySearch(nums,0,min-1,target);
        int s=binarySearch(nums,min,nums.length-1,target);
        if(k==-1 && s==-1){
            return -1;
        }
        if(k!=-1){
            return k;
        }
        else{
            return s;
        }
        
    }

     public static  int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]<nums[right]){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return right;
    }
    public static int binarySearch(int[] nums,int l, int r,int target){
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }
}
