public class RadixSort <T extends Comparable<T>>{


    public T[] sort(T[] arr) {
       try {
            T max = arr[arr.length -1];
            T min = arr[0];
            int[] intArr = new int[arr.length];
            
            for (int i = 0; i < arr.length; i++) {
                    intArr[i] = (Integer) arr[i];
                    if (arr[i].compareTo(max) > 0) {
                        max = arr[i];
                    }
                    if (arr[i].compareTo(min) < 0) {
                        min = arr[i];
                    }
            }

            for (int exp = 1;((Integer) max)/exp > 0; exp*=10) {
                    countingSort(intArr, exp);
            }

            for (int i = 0; i < intArr.length; i++) {
                    arr[i] = (T) Integer.valueOf(intArr[i]);
            }
            
       } catch (ClassCastException e) {
            System.out.println("solo funciona con Integers");
       }

       return arr;
    }

    public void countingSort(int[] arr, int exp){
        int[] counts = new int[10];
        int[] output = new int[arr.length];
        
        for (int i : arr) {
            counts[(i/exp) % 10]++; 
        }
       
        for (int i = 1; i < 10; i++) {
            counts[i] += counts[i-1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            int position = counts[(arr[i] / exp) % 10] - 1;
            output[position] = arr[i];
            counts[(arr[i] / exp) % 10]--;
        }

        System.arraycopy(output, 0, arr, 0, arr.length);
    }
}