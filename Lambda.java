@FunctionalInterface
interface A 
{
    void show();
}

public class Lambda
{
    public static void main(String args[])
    {
        A obj = ()->
        {
            System.out.println("This is a Lambda expression"); 
        };
        obj.show();
    }
    
}