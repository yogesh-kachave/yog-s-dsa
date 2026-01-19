public class MaxArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,99,205};
        int max=Integer.MIN_VALUE;
        
        // for(int i=0;i<arr.length;i++){
        //     max=arr[i];
        // }
        for(int i=0;i<arr.length;i++){
            if (arr[i] > max){
                max=arr[i];
            }
        }
        System.out.print("Max element is:" + max);
    }
    
}
