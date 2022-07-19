import java.util.Arrays;

public class BubbleSort {

    public void sort(int[] array){
        boolean isSorted;
        for (var i = 0; i < array.length - 1; i++){
            isSorted = true; // assume array is sorted
            // comparing items
            for(var j = 1; j < array.length -i; j++)
                if(array[j] < array[j-1]) {
                    swap(array, j, j - 1);
                    isSorted = false;
                }
            if(isSorted)
                return;
        }
    }

    private void swap (int [] array, int index1, int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        int [] numbers = {7,3,1,4,6,2,3,8,1};
        var sorter = new BubbleSort();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
