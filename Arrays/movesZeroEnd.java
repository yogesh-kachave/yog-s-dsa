package Arrays;

public class movesZeroEnd {

    public static void main(String[] args) {
        int arr[]={0,10,0,1,40,0,0,45,50};

        Moves(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void Moves(int arr[]){

        int i=0;
        int j=arr.length-1;

        while(i<j){
         
            if(arr[i]==0 && arr[j]!= 0){

                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

            else if (arr[i]!=0){
                i++;

            }
            else{
                j--;
            }
        }
    }
    
}
