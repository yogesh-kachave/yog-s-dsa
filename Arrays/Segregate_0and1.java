package Arrays;

public class Segregate_0and1 {

    public static void main(String[] args) {
        int arr[]={0,1,1,1,0,0,1};

        sort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void sort(int arr[]){
        int i=0;
        int j=arr.length-1;

        while(i<j){

            if(arr[i]==1 && arr[j]==0){

                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

                i++;
                j--;
            }

            else if(arr[i]==0){
                i++;
            }
            else{
                j--;
            }
        }
    }
    
}
