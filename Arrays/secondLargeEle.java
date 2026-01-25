package Arrays;

public class secondLargeEle {

    public static void main(String[] args) {
        int arr[]={10,50,80,60,90,20};

        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

                if(max<arr[i]){
                    max=arr[i];
                }
            
        }
        for(int j=0;j<arr.length;j++){
            if(smax<arr[j]&& arr[j]!=max){

                        smax=arr[j];
                    }
        }

        System.out.println(max);
        System.out.println(smax);
    
    }
    
}
