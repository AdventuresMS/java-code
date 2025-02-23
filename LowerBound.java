class LowerBound{
   public static void main(String[] args) {
    int [] arr = {2,22,222,333,334,987};

    int n = arr.length;
    int target = 333;
    int lb = n;
    int lo = 0, hi=n-1;
    while(lo<=hi){
        int mid = lo+(hi-lo)/2;
        if(arr[mid]>=target){
            lb = Math.min(lb,mid);
            hi = mid-1;
        }
        else lo = mid+1;
    }
   System.out.println(lb);
   }
}