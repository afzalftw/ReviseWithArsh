
https://leetcode.com/problems/jump-game-ii/class Solution {
    public int jump(int[] nums) {
        //bottom up dp
        int[] dp=new int[nums.length];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        int j=1;
        for(int i=1;i<nums.length;i++){
            int k=i;
            while(k<nums.length&&k<=nums[i-1]+i-1){
                dp[k]=Math.min(dp[k],j);
                k++;
            }
            j=dp[i]+1;
        }
        return dp[dp.length-1];
    }
}
