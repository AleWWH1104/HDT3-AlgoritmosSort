public class QuickSort<T extends Comparable<T>> {

    public void sort(T[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(T[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);

            // Recursively sort the elements before and after the partition index
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    private int partition(T[] arr, int low, int high) {
        T pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (arr[j].compareTo(pivot) <= 0) {
                i++;

                // Swap arr[i] and arr[j]
                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (or the pivot)
        T temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
