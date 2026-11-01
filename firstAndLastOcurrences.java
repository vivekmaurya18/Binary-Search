
import java.util.Arrays;

class firstAndLastOcurrences{
    public static int lowerBound(int[] arr,int n,int x){

        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int upperBound(int[] arr,int n,int x){
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int[] firstAndLast(int[] arr, int n, int k){
        int lb=lowerBound(arr, n, k);
        if(lb==n||arr[lb]!=k){
            return new int[]{-1,-1};
        }
        return new int[] {lb,upperBound(arr, n, k)-1};
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,8,8,8,11,13};
        int n=8;
        int k=8;
        int[] result=firstAndLast(arr, n, k);
        System.out.println(Arrays.toString(result));

    }
}