//complejidad T(n) = 2T(n/2) + O(n)
public class MergeSort<T extends Comparable<T>> {

    public void sort(T[] arr, int left, int right) {
        if (left < right) {
            // Encuentra el punto medio del arreglo.
            int middle = (left + right) / 2;

            // Divide la primera y segunda mitad (llamada recursiva).
            sort(arr, left, middle);
            sort(arr, middle + 1, right);

            // Une las mitades.
            merge(arr, left, middle, right);
        }
    }

    public void merge(T[] arr, int left, int middle, int right) {
        // Encuentra el tamaño de los sub-vectores para unirlos.
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Vectores temporales.
        T[] leftArray = (T[]) new Comparable[n1];
        T[] rightArray = (T[]) new Comparable[n2];

        // Copia los datos a los arrays temporales.
        System.arraycopy(arr, left, leftArray, 0, n1);
        System.arraycopy(arr, middle + 1, rightArray, 0, n2);

        // Índices inicial del primer y segundo sub-vector.
        int i = 0, j = 0;

        // Índice inicial del sub-vector arr[].
        int k = left;

        // Ordenamiento.
        while (i < n1 && j < n2) {
            if (leftArray[i].compareTo(rightArray[j]) <= 0) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }//Fin del while.

        // Si quedan elementos por ordenar.
        // Copiar los elementos restantes de leftArray[].
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        // Copiar los elementos restantes de rightArray[].
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

}
