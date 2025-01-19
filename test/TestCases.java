
import org.junit.Assert;
import org.junit.Test;
import src.search.BinarySearch;
import src.sort.QuickSort;

public class TestCases {

    @Test
    public void testBinarySearchWithTargetPresent() {
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        Assert.assertEquals(2, binarySearch.binarySearch(array, target));
    }

    @Test
    public void testBinarySearchWithTargetNotPresent() {
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {1, 2, 3, 4, 5};
        int target = 6;
        Assert.assertEquals(1, binarySearch.binarySearch(array, target));
    }

    @Test
    public void testBinarySearchWithEmptyArray() {
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {};
        int target = 5;
        Assert.assertEquals(-1, binarySearch.binarySearch(array, target));
    }

    @Test
    public void testQuickSortWithSortedArray() {
        QuickSort quickSort = new QuickSort();
        int[] sortedArray = {1, 2, 3, 4, 5};
        quickSort.quickSort(sortedArray, 0, sortedArray.length - 1);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sortedArray);
    }

    @Test
    public void testQuickSortWithUnsortedArray() {
        QuickSort quickSort = new QuickSort();
        int[] unsortedArray = {5, 4, 3, 2, 1};
        quickSort.quickSort(unsortedArray, 0, unsortedArray.length - 1);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, unsortedArray);
    }

    @Test
    public void testQuickSortWithEmptyArray() {
        QuickSort quickSort = new QuickSort();
        int[] emptyArray = {};
        quickSort.quickSort(emptyArray, 0, emptyArray.length - 1);
        Assert.assertArrayEquals(new int[]{}, emptyArray);
    }
}

