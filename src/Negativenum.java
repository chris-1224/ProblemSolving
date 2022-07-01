
// Problem 5 -> Negative elements to end

import java.util.Arrays;

public class Negativenum {

    public static void main(String[] args) {

        int arr[] = {1, -1, 3, 2, -7, -5, 11, 6};
        int[] temp = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                temp[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                temp[j] = arr[i];
                j++;
            }
        }
        System.out.println("Moving negative numbers to end :");
        System.out.println(Arrays.toString(temp));
    }
}

