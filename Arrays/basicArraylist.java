package Arrays;

import java.util.ArrayList;

public class basicArraylist {

    public static void main(String[] args) {
        ArrayList <Integer> List =new ArrayList<>();
        //Add an list element 
        List.add(10);
        List.add(20);
        List.add(30);
        List.add(40);

        System.out.println(List);

        //Remove an list element
        List.remove(2);

        List.remove(Integer.valueOf(20));

        System.out.println(List);

        //Size of list

        System.out.println(List.size());

        //Search an list element
        System.out.println(List.contains(10));

        //Get an list element

        System.out.println(List.get(1));

        //Set an list element

        System.out.println(List.set(0, 45));

        System.out.println(List);


    }
    
}
