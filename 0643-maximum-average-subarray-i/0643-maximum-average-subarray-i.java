class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int w = 0;
        for(int i = 0;i<k;i++){
            w += nums[i];
        }
        int max = w;
        for(int i = k;i<nums.length;i++){
            w = w - nums[i-k] + nums[i];
            max = Math.max(w,max);
        }
      //  int avg = max/k;
        return (double) max/k;
    }
}