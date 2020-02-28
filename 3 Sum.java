//Question link: https://leetcode.com/problems/3sum

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int target = 0;
        List<List<Integer>> result = new ArrayList<>();
       
        for(int i=0;i < nums.length;i++){
            
            Set hs = new HashSet<>();

        for(int j=i+1; j< nums.length;j++){
            
             List<Integer> ls = new ArrayList<>();
            
           int third =  target - (nums[i]+nums[j]);
            
            if (hs.contains(third)){
                
                ls.add(nums[i]);
                ls.add(nums[j]);
                ls.add(third);
                Collections.sort(ls);
                
                if (!result.contains(ls))
                result.add(ls);
                
            }
            else{
                
                hs.add(nums[j]);
                
                }
        }
            
        }
        
        return result;
        
}
}
