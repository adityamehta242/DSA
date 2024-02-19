public class staticVariablesInRecursion {
    static int globalVariable = 0;
    public static void main(String[] args) {
        int x =5;
        System.out.println(fun(x));
    }

    static int fun(int x)
    {
        if(x>0)
        {
            globalVariable ++;
            // System.out.println(x);
            return fun(x-1) + globalVariable;
        }
        return 0;
    }
}
