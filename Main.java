public class Main{

    //Funcion para imprimir los arreglos
    public static <T extends Comparable<T>> void printArray(T[] arr) {
        for (T t : arr) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        ArchivoRW<Integer> archivo = new ArchivoRW<>();
        GnomeSort<Integer> gnome = new GnomeSort<>();
        MergeSort<Integer> merge = new MergeSort<>();
        QuickSort<Integer> quick = new QuickSort<>();
        RadixSort<Integer> radix = new RadixSort<>();

        for (int i = 10; i <= 20; i++){
            //Generar numeros al azar
            archivo.generarNums("numeros.txt",i);
            //Crear el array con los numeros
            Integer[] numArray = archivo.leer("numeros.txt", Integer::parseInt, i);

            //Ordenarlos con los algoritmos 
            //gnome.sort(numArray);
            //printArray(numArray);

            //merge.sort(numArray, 0, numArray.length - 1);
            //printArray(numArray);

            //quick.sort(numArray);
            //printArray(numArray);

            //radix.sort(numArray);
            //printArray(numArray);
            
            radix.sort(numArray);
            printArray(numArray);
        }


        
        

        
    }

}