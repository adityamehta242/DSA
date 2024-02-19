
public class bubbleSort{
    public static void main(String[] args) {
        int[] arr = {8,25,55,44,0,2,1,9,3,5,4};

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

        for (int i : arr) {
            System.err.print(i + " ");
        }

    }
}