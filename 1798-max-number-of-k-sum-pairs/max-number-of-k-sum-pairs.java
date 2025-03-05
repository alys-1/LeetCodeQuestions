class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int high = nums.length-1;
        int low = 0;
        int ans = 0;
        while(high>low){
            int sum = nums[low] + nums[high];
            if(k==sum){
                low++;
                high--;
                ans++;
            }
            else{ 
                if(k>sum){
                low++;
                }else{ high--;}
            }
        }
        return ans;
    }
    }
