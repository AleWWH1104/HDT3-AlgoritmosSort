//Complejidad Θ(n)
public class GnomeSort <T extends Comparable<T>> {

    public void sort(T[] arr){
        int i = 0;
        while (i < arr.length) {
            if (i == 0 || arr[i].compareTo(arr[i - 1]) >= 0) {
                i++;
            } else {
                // Intercambiar los elementos si no están en orden
                T temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
                i--;
            }
        }
    }
}
 
