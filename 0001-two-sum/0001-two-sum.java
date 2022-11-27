class Solution {
    public int[] twoSum(int[] nums, int target){
        /*for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    int[] arr1={i,j};
                    return arr1;
                }
            }
        }
      int[] ans={0,0};
        return ans;*/
        int[] res=new int[2];
        Map<Integer,Integer> ans=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(ans.containsKey(target-nums[i])){
               res[1]=i;
                res[0]=ans.get(target-nums[i]);
            }
            ans.put(nums[i],i);
        }
        return res;
        
}
    
}