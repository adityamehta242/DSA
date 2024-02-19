class basicUnderstanding
{
    public static void main(String[] args) {
        int x = 5;

        basicUnderstanding ss = new basicUnderstanding();
        System.out.print("This is during calling Phase : ");
        ss.funCallingPhase(x);
        System.out.println(" ");
        System.out.print("This is during Returning Phase : ");
        ss.funReturningPhase(x);


    }

    void funCallingPhase(int x)
    {
        if(x>0)
        {
            System.out.print(x + " ");
            funCallingPhase(x-1);
        }
    }

    void funReturningPhase(int x)
    {
        if(x>0)
        {
            funReturningPhase(x-1);
            System.out.print(x + " ");
        }
    }

}