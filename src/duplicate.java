
// Problem 6 -> Duplicates in an array

public class duplicate {

    public static void main(String[] args) {

        //Initialize array
        int [] arr = new int [] {1, 3, 2, 4, 2, 5, 4, 2, 1};

        System.out.println("Duplicate elements in given array: ");
        //Searches for duplicate element
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}
