public class exceptionHandling
{
    public static void main(String args[])
    {
        try{
            int result = divide(10,0);
            System.out.println(result);
        }catch(ArithmeticException e)
        {
            System.out.println("Denomintor cannot be zero");
        }
    }

    static int divide(int x,int y)
    {
        return x/y;
    }
}