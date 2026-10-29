class ceil {
    public static int ceil(int[] arr, int x){
        int n=arr.length;
        int ans=-1;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=x){
                ans=arr[mid];
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int x=25;
        int result=ceil(arr, x);
        System.out.println(result);
    }
}
