package Arrays;

import java.util.Scanner;

public class Transpose_arr {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Rows and cols in matrix:");

        System.out.println("Enter a no of rows:");
        int r=sc.nextInt();

        System.out.println("Enter the no of cols:");
        int c=sc.nextInt();

        int arr[][]=new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Matrix is:");
        print(arr);

        System.out.println("Transpose of Matrix is:");

       

        transpose(arr,r,c);

        
        
        
    }

    public static void print(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    
    public static void transpose(int arr2[][], int r, int c){

    int trans[][]=new int[r][c];
    for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                
                    trans[i][j]=arr2[j][i];

                    System.out.print(trans[i][j]+" ");
                    
            }

            System.out.println();
            
        }
    }
    
    
}
