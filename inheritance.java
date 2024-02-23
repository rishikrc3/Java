class Animal
{
    void eat()
    {
        System.out.println("The Animal is eating");
    }
}

class Dog extends Animal
{
    void Dog()
    {
        System.out.println("The Dogs is eating ");
    }
}

public class inheritance
{
    public static void main(String args[])
    {
        Dog obj = new Dog();
        obj.eat();
        obj.Dog();
    }
}