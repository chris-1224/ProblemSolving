
// Problem 3 -> Repeating and Non Repeating Numbers

import java.util.Arrays;

public class repnonrep {

    public static void main(String[] args) {
        int [] arr = {8,9,6,8,5,1,8,5,1};
        int[] temp = new int[arr.length];
        Arrays.sort(arr);
        int a, b;
        a = 0;
        b = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                temp[a] = arr[i];
                i++;
                a++;
            }
        }
        int[] repnum = new int[a];
        for (int i = 0; i < a; i++) {
            repnum[i] = temp[i];
        }
        int[] temp1 = new int[arr.length - a];

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < a; j++) {
                if (arr[i] == repnum[j]) {
                    found = true;
                }
            }
            if (!found) {
                temp1[b] = arr[i];
                b++;
            }
        }

        int[] nonrepnum = new int[b];
        for (int i = 0; i < b; i++) {
            nonrepnum[i] = temp1[i];
        }

        System.out.println("Repeating numbers :");
        System.out.println(Arrays.toString(repnum));
        System.out.println("Non-repeating numbers :");
        System.out.println(Arrays.toString(nonrepnum));
    }
}
