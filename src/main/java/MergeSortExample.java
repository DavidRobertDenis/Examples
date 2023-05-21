import java.util.Arrays;

public class MergeSortExample {

    public static void main(String[] args) {
        int[] vector = {5, 2, 8, 3, 1, 6, 4, 7};

        System.out.println("Vectorul nesortat: " + Arrays.toString(vector));

        mergeSort(vector);

        System.out.println("Vectorul sortat: " + Arrays.toString(vector));
}
    public static void mergeSort(int[] vector) {
        if (vector.length <= 1) {
            return;
        }

        int middle = vector.length / 2;
        int[] left = Arrays.copyOfRange(vector, 0, middle);
        int[] right = Arrays.copyOfRange(vector, middle, vector.length);

        mergeSort(left);
        mergeSort(right);

        merge(vector, left, right);
    }

    public static void merge(int[] vector, int[] left, int[] right) {
        int i = 0; // index pentru vectorul stanga
        int j = 0; // index pentru vectorul dreapta
        int k = 0; // index pentru vectorul sortat

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                vector[k] = left[i];
                i++;
            } else {
                vector[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            vector[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            vector[k] = right[j];
            j++;
            k++;
        }
    }
}