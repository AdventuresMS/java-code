package Recursion;

public class ArrayInRecursion {
    public static void print(int i,int []arr){
        if(i==arr.length)return;
        System.out.print(arr[i]+" ");
        print(i+1,arr);
    }
    public static void main(String[] args) {
        int [] arr= {2,33,43,53,342,64,224,67};
        print(0,arr);
    }
    
}
