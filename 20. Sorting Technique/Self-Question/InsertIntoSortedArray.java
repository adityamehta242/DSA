public class InsertIntoSortedArray {
    public static void main(String[] args) {
        int[] sortedArray = new int[6];
        sortedArray[0] = 10;
        sortedArray[1] = 20;
        sortedArray[2] = 30;
        sortedArray[3] = 40;
        sortedArray[4] = 50;

        int elementToInsert = 35;

        System.out.println("Original Sorted Array:");
        printArray(sortedArray);

        insertIntoSortedArray(sortedArray, elementToInsert);

        System.out.println("\nArray after inserting " + elementToInsert + ":");
        printArray(sortedArray);
    }

    static void insertIntoSortedArray(int[] arr, int element) {
        int n = arr.length;
        int i;

        // Find the position where the element should be inserted
        for (i = n - 2; (i >= 0 && arr[i] > element); i--) {
            arr[i + 1] = arr[i];
        }

        // Insert the element at its correct position
        arr[i + 1] = element;
    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }  
        System.out.println();
    }
}
