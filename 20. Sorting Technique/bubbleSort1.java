public class bubbleSort1 {
    public static void main(String[] args) {
        int[] array = {25,12,99,102,70,65,22,34,0,45};

        System.out.print("Unsorted Array : ");
        printArray(array);

        bubbleSort(array);

        System.out.print("\nSorted Array : ");
        printArray(array);

    }

    public static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(" " + i );
        }
    }

    public static void bubbleSort(int[] arr)
    {
        for(int i = 0 ; i  < arr.length - 1; i++)
        {
            int temp = 0;
            for(int j = 0 ; j < arr.length - i -1 ; j++)
            {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                }
            }
        }

    }
}
