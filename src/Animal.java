public class Animal
{
    protected String name;
    protected String color;

    public static void main(String[] args)
    {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.name = "Diego";
        dog.color = "Grey";

        cat.name = "Garfield";
        cat.color = "Orange";

        System.out.println(dog.makeSound());
        System.out.println(cat.makeSound());
    }
}
class Dog extends Animal
{
    String makeSound()
    {
        return color + " " + name + " sounds woof woof.";
    }
}

class Cat extends Animal
{
    String makeSound()
    {
        return color + " " + name + " sounds meow.";
    }
}