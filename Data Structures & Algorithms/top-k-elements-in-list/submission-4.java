class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i],1);
            }
            else{
                mp.put(nums[i],mp.get(nums[i])+1);
            }
        }
        int i=0;
        int[] ans=new int[k];
        while(i<k){
        int maxKey=Integer.MIN_VALUE;
        int maxFreq=Integer.MIN_VALUE;
        for (int key: mp.keySet()){
            if(mp.get(key)>maxFreq){
                maxKey=key;
                maxFreq=mp.get(key);
            }
        }
        ans[i]=maxKey;
        mp.remove(maxKey);
        i++;
        }
        return ans;
    }
}
