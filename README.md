# HDT3-AlgoritmosSort

Aquí tienes un README básico para describir tu proyecto. Puedes agregar más detalles según sea necesario:

# Proyecto de Algoritmos de Ordenamiento

Este proyecto proporciona implementaciones de varios algoritmos de ordenamiento en Java. Los algoritmos de ordenamiento incluidos son:

1. GnomeSort
2. MergeSort
3. QuickSort
4. BubbleSort
5. RadixSort

## Clases y Funciones

### 1. GnomeSort

El GnomeSort es un algoritmo de ordenamiento simple que funciona explorando la lista y haciendo los cambios necesarios.

- **Clase**: `GnomeSort`
- **Método**: `sort(T[] arr)`
    - Ordena el arreglo `arr` utilizando el algoritmo GnomeSort.

### 2. MergeSort

El MergeSort es un algoritmo de ordenamiento que utiliza el método "divide y conquista" para ordenar los elementos.

- **Clase**: `MergeSort`
- **Métodos**:
    - `sort(T[] arr, int left, int right)`: Ordena una parte específica del arreglo `arr`.
    - `merge(T[] arr, int left, int middle, int right)`: Combina dos sub-arrays ordenados en un solo array.

### 3. QuickSort

El QuickSort es un algoritmo de ordenamiento que utiliza el método "divide y conquista" para ordenar los elementos.

- **Clase**: `QuickSort`
- **Métodos**:
    - `sort(T[] arr)`: Inicia el proceso de ordenamiento.
    - `quickSort(T[] arr, int low, int high)`: Ordena un subarreglo del arreglo `arr`.
    - `partition(T[] arr, int low, int high)`: Particiona el arreglo en torno a un elemento pivote.

### 4. BubbleSort

El BubbleSort es un algoritmo de ordenamiento simple que funciona comparando cada par de elementos adyacentes y cambiándolos si están en el orden incorrecto.

- **Clase**: `BubbleSort`
- **Método**: `sort(T[] arr)`
    - Ordena el arreglo `arr` utilizando el algoritmo BubbleSort.

### 5. RadixSort

El RadixSort es un algoritmo de ordenamiento no comparativo que ordena los elementos procesando los dígitos individuales de los números.

- **Clase**: `RadixSort`
- **Métodos**:
    - `sort(T[] arr)`: Inicia el proceso de ordenamiento.
    - `countingSort(int[] arr, int exp)`: Realiza el counting sort para el arreglo dado y el exponente especificado.


Aquí tienes la sección adicional que puedes agregar al README para incluir la clase `Main` y su funcionalidad:

---

## Clase Main

La clase `Main` es la clase principal del proyecto y proporciona un punto de entrada para ejecutar y probar los algoritmos de ordenamiento implementados.

### Método `main`
1. Crea instancias de los algoritmos de ordenamiento.
2. Genera arreglos de números aleatorios utilizando la clase `ArchivoRW`.
3. Ordena los arreglos utilizando cada uno de los algoritmos de ordenamiento.
4. Imprime los arreglos ordenados en la consola.
