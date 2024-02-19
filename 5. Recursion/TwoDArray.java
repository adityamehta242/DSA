import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
class TwoDArray {
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        // int size;
        // System.out.print("Size of Arrays : ");
        // size = inn.nextInt();
        // String arr[] = new String[size];
        // String gg = inn.nextLine();

        // for(int i = 0; i < arr.length; i++)
        // {
        // System.out.print("Enter value : ");
        // arr[i] = inn.nextLine();
        // }

        // for(String xx : arr)
        // {
        // System.out.print(xx + " ");
        // }

        /*
         * int arr2D[][] = {
         * { 1, 2, 3 },
         * { 4, 5, 6 },
         * { 7, 8, 9 }
         * };
         * 
         * for (int[] i : arr2D) {
         * System.out.println(Arrays.toString(i));
         * }
         */

        // System.out.print("Size of row : ");
        // int row = inn.nextInt();
        // // int coln = inn.nextInt();

        int arr1[][] = new int[3][];
        for (int i = 0; i < arr1.length; i++) {

            System.out.print("Size of " + i + "index Column : ");
            int coln = inn.nextInt();
            arr1[i] = new int[coln]; 


            for (int j = 0; j < arr1[i].length; j++) {
                
                arr1[i][j] = inn.nextInt();
            }
        }

        for (int[] i : arr1) {
            System.out.println(Arrays.toString(i));
        }

    }
}