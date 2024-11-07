/**
 * reference
 */
public class reference {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
        System.out.println();
    }// line 5 to 9 is a method to print.

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        arr[3] = 30;
        arr[4] = 18;

        System.out.println("Original Array");
        printArray(arr);

        int[] arr_2 = arr;

        System.out.println("Copied Array");
        printArray(arr_2);

        // Changing some value of arr_2;
        arr_2[0] = 0;
        arr_2[1] = 100;
        System.out.println("original array after changing arr_2");
        printArray(arr);

        System.out.println("Copied array after changing arr_2");
        printArray(arr_2);

    }
}
// referencing me jo arr ka stack memory me locate hoga i.e,101 vahi arr_2 me
// bhi vahi allocate hoga
// aur agar hum kisi ek change karte h to dono me change ho jayega
