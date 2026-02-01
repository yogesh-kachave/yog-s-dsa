package Arrays;

import java.util.ArrayList;

public class maximumArraylist {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(31);
        list.add(14);
        list.add(3);
        list.add(32);
        list.add(2);
        list.add(5);

        int max=Integer.MIN_VALUE;

        for(int i=0;i<list.size();i++){

            // if(max<list.get(i)){
            //     max=list.get(i);
            // }

            max=Math.max(max, list.get(i));
        }

        System.out.println(max);
    }
    
}
