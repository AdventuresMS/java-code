public class BinarySearch{
    static boolean binarySearch(int []arr,int target){
        int n = arr.length ;
        int lo = 0, hi = n-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(target==arr[mid]){
                return true;

            }
            else if(target<arr[mid]){
                    hi = mid-1;
                }
                else{
                    lo = mid+1;
                }
        }
            return false;
            }
        
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,6,7};
        int target = 5;
        System.out.println(binarySearch(arr,target)); 
    }
}