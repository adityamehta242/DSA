import java.util.Arrays;
import java.util.Scanner;;
class nullLiteral{

    public static void main(String Args[])
    {
        String arr[] = new String[5];
        int arr1[] = new int[5];

        Scanner get = new Scanner(System.in);

        // System.out.println(arr);

        for(int i = 0; i< arr1.length;i++)
        {
            arr1[i]= get.nextInt();
        }
        // System.out.println(arr1[0]);


        // for (int i : arr1) {
        //     System.out.println(i);
        // }

        System.out.println(Arrays.toString(arr1));

    }
}