
public class selectionSort
{
	public static void main(String[] args) {
		int[] array = {1,2,5,0,3,6,4};
		printArray(array);
		System.out.println();
		sort(array);
		printArray(array);
	}
	
	
	public static void sort(int[] array)
	{
	    int i, j , k ;
	    int temp;
	    
	    for(i = 0 ; i < array.length - 1 ; i ++)
	    {
	        for(j = k = i ; j < array.length ; j ++)
	        {
	            
	            if(array[k]> array[j])
	            {
	                k = j;
	            }
	        }
	        
	        temp = array[i];
	        array[i] = array[k];
	        array[k] = temp;
	        
	    }
	}
	
	public static void printArray(int[] array)
	{
	    for(int i : array)
	    {
	        System.out.print(" " + i);
	    }
	}
}
