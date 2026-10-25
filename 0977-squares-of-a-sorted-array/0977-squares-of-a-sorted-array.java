class Solution {
    public int[] sortedSquares(int[] nums) {
int result[] = new int[nums.length];
int l = 0, r = nums.length-1, k = nums.length-1;
while(l<=r){
    if(Math.abs(nums[l])>Math.abs(nums[r])){
        result[k] = nums[l];
        l++;
        k--;
    }
    else{
        result[k] = nums[r];
        r--;
        k--;
    }
}
for(int i = 0;i<result.length;i++){
    result[i] = result[i]* result[i];
}
         return result;
    }
}