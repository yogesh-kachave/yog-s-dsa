package Arrays;
public class Roatate1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};

        roatate(arr, 0, arr.length-1);

        roatate(arr, 1, arr.length-1);

        for( int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }


    }

    public static void roatate(int arr[],int i,int j){

        while(i<j){

            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;

        }

    }
    
}
