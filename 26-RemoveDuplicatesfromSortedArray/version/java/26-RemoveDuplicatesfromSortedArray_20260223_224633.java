// Last updated: 23/02/2026, 22:46:33
1class Solution {
2    public int removeElement(int[] nums, int val) {
3        int i=0;
4        for(int j=0;j<nums.length;j++){
5            if(nums[j]!=val){
6                int temp=nums[i];
7                nums[i]=nums[j];
8                nums[j]=temp;
9                i++;
10            }
11        }
12        return i;
13    }
14}