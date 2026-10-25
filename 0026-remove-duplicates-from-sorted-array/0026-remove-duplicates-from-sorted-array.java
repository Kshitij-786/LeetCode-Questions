class Solution {
    public int removeDuplicates(int[] nums) {
       if(nums.length == 0){
        return 0;
       } 
       int pos = 0;
       for(int i = 0;i<nums.length;i++){ // 1 se b/c 0 or element duplicate jaisa hota, no remove required
        if(nums[i] != nums[pos]){
            pos++;
            nums[pos] = nums[i]; 
        }
       }
       return pos+1;
    }
}