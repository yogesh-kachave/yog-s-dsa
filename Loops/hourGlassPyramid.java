package Loops;

public class hourGlassPyramid {

    public static void main(String[] args) {
        for(int i=0;i<=3;i++){

            for(int j=0;j<i;j++){
                System.out.print("  ");
            }

            for(int k=0;k<= 2*(3-i);k++){
                System.out.print("* ");
            }

            System.out.println();
        }

        for(int i=1;i<=3;i++){

            for(int j=0;j<3-i;j++){
                System.out.print("  ");
            }

            for(int k=0;k<=2*i;k++){
                System.out.print("* ");
            }

            System.out.println();

        }
    }
    
}
