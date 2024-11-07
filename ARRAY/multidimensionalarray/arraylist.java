import java.util.ArrayList;
public class arraylist{
    
    }
    public static void main(String[] args){
        // wrapper classes
        /*
        Integer i = Integer.valueOf(11);
        System.out.println(i);
        Float f = Float.valueOf(4.5f);
        System.out.println(f);
         */
        //ArrayList

        ArrayList<Integer> l1 = new ArrayList<>();

        // for adding new element
        l1.add(5);//5
        l1.add(10);//5 10
        l1.add(11); 
        l1.add(15);

        // get an element at index i
        System.out.println("Get an element at index i");
        System.out.println(l1.get(0));
        System.out.println(l1.get(2));

        // print with for loop
System.out.println("Print with for loop ");
        for(int i = 0; i< l1.size(); i++){
            System.out.println(l1.get(i));
        }

        //printing the array list directly
        System.out.println("printing the array list directly");
        System.out.println(l1);//[5,10,11,15]

        //adding element at some position in the array list
        System.out.println("adding element at some position");
        l1.add(1, 100);
        System.out.println(l1);

        //modifying element at index in 
        System.out.println("Modifying element at index");
        l1.set(1,90);
        System.out.println(l1);

        // removing an element at index i
        System.out.println("removing an element at index");
        l1.remove(1);
        System.out.println(l1);

        // removing an element e

        l1.remove(Integer.valueOf(10));
        System.out.println(l1);
        System.out.println("the element is present it gives true and if not present it gives false");
        System.out.println(l1.remove(Integer.valueOf(20)));
        System.out.println(l1);

        //checking if n elemeent exist
        l1.add(1,10);
        System.out.println("the array is " + l1 );
        System.out.println("Checking if an element exist or not");
        boolean ans = l1.contains(Integer.valueOf(10));
        System.out.println(ans);

        boolean ans1 = l1.contains(Integer.valueOf(60));
        System.out.println(ans1);

        // if you dont specify class, you can put anything inside l
        System.out.println("anytype of value");
        ArrayList l = new ArrayList();
        l.add("p");
        l.add(1);
        l.add(true);
        l.add(4.5f);
        l.add("Adarsh");
        System.out.println(l);

        // Write a program to reverse the given arrayList.

    }
}