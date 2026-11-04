class aggressiveCows{
    public static boolean isPossible(int[] stalls,int k,int distance){
        int n=stalls.length;
        int count=1;
        int lastPosition=1;

        for(int i=1;i<n-1;i++){
            if(stalls[i]-stalls[0]>=distance){
                count++;
                lastPosition=stalls[i];
            }
            if(count>=k){
                return true;
            }
        }
        return false;
    }
    public static int aggressiveCows(int[] stalls,int k){
        int n=stalls.length;
        int low=1;
        int high=stalls[n-1]-stalls[0];
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(stalls, k, mid)){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] stalls={1, 2, 4, 8, 9};
        int k=3;
        int distance=3;
        int result = aggressiveCows(stalls, k);

        System.out.println("Maximum minimum distance: " + result);

    }
}