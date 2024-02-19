public class insertionSort{
    public static void main(String[] args) {
        int[] arr = {20,21,85,32,55,69,0,1,45};

        sort(arr);

        for (int h : arr) {
            System.err.print(h + " ");
        }

    }

    public static void sort(int[] array)
    {
        for(int i = 1 , j ; i < array.length ; i ++)
        {
            int currentArrayElement = array[ i ];
            j = i-1;

            while (j >= 0 && array[ j ] > currentArrayElement ) {
                array[ j+1 ] = array[ j ];
                j--;
            }
            array[ j + 1 ] = currentArrayElement;  //reassingn element at same place if swap is not happen.
        }
    }
}


/*
 
 */