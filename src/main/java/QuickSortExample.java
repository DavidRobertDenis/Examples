import java.util.Arrays;

public class QuickSortExample {
    public static void main(String[] args) {
        int[] vector = {5, 2, 8, 3, 1, 6, 4, 7, 9};

        System.out.println("Vectorul nesortat: " + Arrays.toString(vector));

        quickSort(vector, 0, vector.length - 1);

        System.out.println("Vectorul sortat: " + Arrays.toString(vector));
}

    public static void quickSort(int[] vector, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(vector, low, high);
            quickSort(vector, low, pivotIndex - 1);
            quickSort(vector, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] vector, int low, int high) {
        int pivot = vector[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (vector[j] < pivot) {
                i++;
                swap(vector, i, j);
            }
        }

        swap(vector, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] vector, int i, int j) {
        int temp = vector[i];
        vector[i] = vector[j];
        vector[j] = temp;
    }
}