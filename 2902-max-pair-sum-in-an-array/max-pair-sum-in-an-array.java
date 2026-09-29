class Solution {
    public int maxSum(int[] nums) {
        int hash[] = new int[10];

        Arrays.fill(hash, -1);
           int ans=-1;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int largest=0;
            while (num > 0) {
                largest = Math.max(largest, num % 10);
                num /= 10;
            }
            if (hash[largest] != -1) {
                ans = Math.max(ans, hash[largest] + nums[i]);
            }
            hash[largest] = Math.max(hash[largest], nums[i]);
        }
        return ans;
    }
}