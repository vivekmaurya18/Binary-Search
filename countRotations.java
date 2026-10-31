class countRotations{
    public static int rotatedArray(int[] arr){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=Integer.MAX_VALUE;
        int index=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[low]<=arr[high]){
                if(arr[low]<ans){
                    index=low;
                    ans=arr[low];
                }
                break;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<ans){
                    index=low;
                    ans=arr[low];
                }
                low=mid+1;
            }
            else{
                high=mid-1;
                if(arr[mid]<ans){
                    index=mid;
                    ans=arr[mid];
                }
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        int res=rotatedArray(arr);
        System.out.println(res);
    }
}