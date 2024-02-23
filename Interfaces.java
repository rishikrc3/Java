interface Greeting{
    void greet();
}


class SimpleGreeting implements Greeting
{
    public void greet()
    {
        System.out.println("This is a simple greeting");
    }
}

public class interfaces 
{
    public static void main(String args[])
    {
        SimpleGreeting obj = new SimpleGreeting();
        obj.greet();
    }
}