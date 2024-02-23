class Parent{
    final void display()
    {
        System.out.println("This is a parent class");
    }
}

class Child extends Parent
{
    void display()
    {
        //This will throw an eror as we are tryign to override a final method
        System.out.println("Trying to override the final method");;
    }
}


class final{
    public static void main(String args[])
    {
        Child obj = new Child();
        obj.display();
    }
    
}