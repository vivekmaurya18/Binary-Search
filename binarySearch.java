class binarySearch {
    public static int search(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target>nums[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={3,4,6,7,9,12,16,17};
        int target=13;
        int result=search(arr, target);
        System.out.println(result);
    }
}