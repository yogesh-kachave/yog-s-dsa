package Arrays;

import java.util.Scanner;

public class Addition_2DArr {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Rows and cols of first matrix:");

        System.out.println("Enter the no rows:");
        int r1=sc.nextInt();

        System.out.println("Enter the no of cols:");
        int c1=sc.nextInt();

        int [][] a= new int [r1][c1];

        System.out.println("Enter " +r1*c1+" elements:");

        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){

                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("This is the first matrix:");
        print(a);
        

        System.out.println("Rows and cols of second matrix:");

        System.out.println("Enter the no of rows:");
        int r2=sc.nextInt();

        System.out.println("Enter the no of cols:");
        int c2=sc.nextInt();

        int b[][]=new int [r2][c2];

        System.out.println("enter "+r2*c2+"elements:" );

        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }

        System.out.println("This is second matrix:");
        print(b);

        System.out.println("Addition of two matrix is:");
        add(a, r1, c1, b, r2, c2);

    }

    public static void print(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void add(int a[][],int r1, int c1, int b[][], int r2, int c2){
        if(r1!=r2 | c1!=c2){
            System.out.println("Addition is not possible");
            return;

        }

        int sum[][]=new int [r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        print(sum);
    }
}