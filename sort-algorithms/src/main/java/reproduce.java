package main.java;

public class reproduce {

    public static void main(String[] args) {
        int[] intArray = new int[7];

        intArray[0] = 30;
        intArray[1] = 25;
        intArray[2] = -15;
        intArray[3] = -1;
        intArray[4] = 7;
        intArray[5] = 55;
        intArray[6] = -7;

        for (int end = intArray.length; end > 0; end--) {
            int largest = 0;

            for (int i = 1; i <= end; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
                swap(intArray, i, largest);
            }
        }



        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }


    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
