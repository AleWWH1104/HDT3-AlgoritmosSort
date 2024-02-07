import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class Tests {

    @Test
    public void testRadixSort() {
        RadixSort<Integer> radixSort = new RadixSort<>();
        Integer[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        Integer[] expected = {2, 24, 45, 66, 75, 90, 170, 802};
        assertArrayEquals(expected, radixSort.sort(arr));
    }

    @Test
    public void testBubbleSort() {
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        Integer[] arr = {64, 34, 25, 12, 22, 11, 90};
        Integer[] expected = {11, 12, 22, 25, 34, 64, 90};
        bubbleSort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testQuickSort() {
        QuickSort<Integer> quickSort = new QuickSort<>();
        Integer[] arr = {64, 34, 25, 12, 22, 11, 90};
        Integer[] expected = {11, 12, 22, 25, 34, 64, 90};
        quickSort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSort() {
        MergeSort<Integer> mergeSort = new MergeSort<>();
        Integer[] arr = {64, 34, 25, 12, 22, 11, 90};
        Integer[] expected = {11, 12, 22, 25, 34, 64, 90};
        mergeSort.sort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testGnomeSort() {
        GnomeSort<Integer> gnomeSort = new GnomeSort<>();
        Integer[] arr = {64, 34, 25, 12, 22, 11, 90};
        Integer[] expected = {11, 12, 22, 25, 34, 64, 90};
        gnomeSort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    //Test para arrays vacios, repetir lo mismo para las demas
    @Test
    public void testSortWithEmptyArray() {
        RadixSort<Integer> radixSort = new RadixSort<>();
        Integer[] arr = {};
        Integer[] expected = {};
        assertArrayEquals(expected, radixSort.sort(arr));
    }
}
