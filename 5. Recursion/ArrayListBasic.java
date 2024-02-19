import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListBasic {
    public static void main(String[] args) {
        // Syntax
        // ArrayList<Integer> arr = new ArrayList<>();

        // arr.add(25);

        // System.out.println(arr);


        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> MutliArr= new ArrayList<>(5);

        for(int i = 0; i< MutliArr.size();i++)
        {
            MutliArr.add(new ArrayList<>());
            for(int j = 0; j < MutliArr.get(i).size(); j++)
            {
                
            }
        }
    }
}
