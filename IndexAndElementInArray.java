class IndexAndElementInArray{
    public static void main(String[] args) {
        int [] arr = {12,43,98,45,43};
        int x = 45;
        int index = -1;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]==x){
                index = i;
                break;
            }
        }
        if(index!=-1){
            System.out.println("Element " + x + " found at index:"+index);
        
        }
        else{
            System.out.println("element not found");
        }
    }
}