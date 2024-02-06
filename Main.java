public class Main <T extends Comparable<T>> {

    public static <T extends Comparable<T>> void printArray(T[] arr) {
        for (T t : arr) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        MergeSort<Integer> merge = new MergeSort<>();
        GnomeSort<Integer> gnome = new GnomeSort<>();
        Integer[] arr1 = {37, 5, 36, 1, 8, 4};
        Integer[] arr2 = {98, 5, 3, 1, 48, 14};

        System.out.println("Array original Merge:");
        printArray(arr1);

        System.out.println("Array ordenado Merge:");
        merge.sort(arr1, 0, arr1.length - 1);
        printArray(arr1);
        System.out.println("Array original Gnome:");
        printArray(arr2);

        System.out.println("Array ordenado Gnome:");
        gnome.sort(arr2);
        printArray(arr2);
    }

}