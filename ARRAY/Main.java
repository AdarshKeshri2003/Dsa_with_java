class ArraysExample {
    void demoArrays() {
        int[] ages = new int[3];
        float[] weights = new float[3];
        String[] names = { "Rahul", "Raj", "Sita" };

        ages[0] = 34;
        ages[1] = 12;
        ages[2] = 45;
        // loops to print the number
        for (int i = 0; i < 3; i++) {
            System.out.println(ages[i]);
        } // inplace of 3 we can write ages.length;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        weights[0] = 12f;
        weights[1] = 25.2f;
        weights[2] = 3.6f;

        System.out.println("weights");

        // to print the same number we take the help of loops
        for (float x : weights) {
            System.out.println(x);
        }

        System.out.println(weights[0]);
        System.out.println(weights[1]);
        System.out.println(weights[2]);

        System.out.println("Names");
        // to print the names we cn take help of while loops

        int k = 0;
        while (k < 3) {
            System.out.println(names[k]);
            k++;
        } // int the place of 3 we can write names.length;
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        System.out.println("Length of the element in the ages, names, weights ");
        System.out.println(ages.length);
        System.out.println(weights.length);
        System.out.println(names.length);
    }

    void multiArray() {
        // int [][] arr_1 = new int[2][3]; OR
        int[][] arr = { { 8, 95, 37 }, { 85, 65, 43 } };
        // arr[0][0] =8;
        System.out.println(arr[0][0]);// 8
        System.out.println(arr[0][1]);// 95
        System.out.println(arr[0][2]);// 37

        System.out.println(arr[1][0]);// 85
        System.out.println(arr[1][1]);// 65
        System.out.println(arr[1][2]);// 43

        for (int a = 0; a < 3; a++) {
            for (int b = 1; b < 4; b++) {
                System.out.println(arr[a][b]);
            }
        } // int the palce of 3 we can write the arr.length & for 4 we can write
          // arr[a].length;
    }
}

public class Main {
    public static void main(String[] args) {
        ArraysExample obj = new ArraysExample();

        ArraysExample obj1 = new ArraysExample();
        obj.demoArrays();
        obj1.multiArray();
    }
}