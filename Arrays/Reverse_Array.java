package Arrays;

public class Reverse_Array {

    public static void main(String[] args) {
        int arr[]={50,40,30,20,10};

        reverse(arr);


        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    
    }

    public static void reverse(int arr[]){
        
        int low=0;
        int high=arr.length-1;

        while(low<high){
            //Swap
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;

            low++;
            high--;
        }
    }


    
}
