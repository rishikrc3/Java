class Animal
{
    void Sound()
    {
        System.out.println("some generic sound");
    }
}

class Dog extends Animal
{
    void Sound()
    {
        System.out.println("Barks");
    }
}

class Cat extends Animal
{
    void Sound()
    {
        System.out.println("Meows");
    }
}

class Abs
{
    public static void main(String args[])
    {
        Dog obj = new Dog();
        Cat obj1=new Cat();

        obj.Sound();

        obj1.Sound(); 
        
    }
}