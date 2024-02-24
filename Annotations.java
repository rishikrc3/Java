class A 
{
    void show()
    {
        System.out.println("Inside of A");
    }
}

class B extends A
{
    @Override
    void show()
    {
        System.out.println("Inside of B");
    }
}


public class Annotations
{
    public static void main(String args[])
    {
        B obj = new B();
        obj.show();
    }
}