//https://leetcode.com/problems/kth-largest-element-in-an-array/
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int x:nums){
            if(p.size()<k) p.offer(x);
            else if(x>p.peek()){
                p.poll();
                p.offer(x);
            }
        } 
        System.out.println(p);
        return p.poll();   
    }
}
