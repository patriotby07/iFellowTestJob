import java.util.Arrays;

public class MaxMinAverValueRandomArray {

    static void maxMinAverValueRandomArray(int lengthArray) {
        if (lengthArray < 1) {
            throw new RuntimeException("Length of the array must be greater than 1");
        }

        double[] arr = new double[lengthArray];
        double aver = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
            aver += arr[i];
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }

        System.out.println(Arrays.toString(arr));
        System.out.printf("Average array values = %f \nMax array value = %f \nMin array value = %f", aver/arr.length, max, min);
    }

    public static void main(String[] args) {
        maxMinAverValueRandomArray(5);
        System.out.println();
        maxMinAverValueRandomArray(10);
        System.out.println();
    }
}
