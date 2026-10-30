
class countOcurrence {
    public static int countOcurrences(int[] nums, int target) {
        int n = nums.length;

        int lb = lowerBound(nums, n, target);

        if (lb == n || nums[lb] != target) {
            return 0;
        }

        int ub = upperBound(nums, n, target);

        return ub - lb;
    }

    public static int lowerBound(int[] nums, int n, int target) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int upperBound(int[] nums, int n, int target) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={2,8,8,8,8,8,11,13};
        int target=8;
        int res=countOcurrences(nums,target);
        System.out.println(res);

    }
}
