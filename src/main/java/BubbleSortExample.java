import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] vector = {5, 2, 8, 3, 1, 6, 4};

        System.out.println("Vectorul nesortat: " + Arrays.toString(vector));

        bubbleSort(vector);

        System.out.println("Vectorul sortat: " + Arrays.toString(vector));



}

    public static void bubbleSort(int[] vector) {
        int n = vector.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vector[j] > vector[j + 1]) {
                    swap(vector, j, j + 1);
                }
            }
        }
    }

    public static void swap(int[] vector, int i, int j) {
        int temp = vector[i];
        vector[i] = vector[j];
        vector[j] = temp;
    }
}

