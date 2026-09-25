class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // first occurence to last occurence of the target
        int low = 0;
        int high = nums.length - 1;
        int lowerBound= -1;
        Arrays.sort(nums);

        List<Integer> l = new ArrayList<>();
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                lowerBound = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        if (lowerBound != -1) {
             low = 0;
            high = nums.length - 1;
            int upperBound = -1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (nums[mid] == target) {
                    upperBound = mid;
                    low=mid+1;
                } else if (nums[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }

            }
            if(lowerBound==upperBound){
                return Arrays.asList(lowerBound);
            }
            for(int i=lowerBound;i<=upperBound;i++){
                l.add(i);
            }

        }
        return l;
    }
}