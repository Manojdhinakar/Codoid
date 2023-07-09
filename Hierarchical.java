class Hierarchical{
    void eat()
    {
        System.out.println("Animal eating...");
    }
}
class Wolf extends Hierarchical{
    void bark()
    {
        System.out.println("WWolf barking...");
    }
}
class Kitten extends Hierarchical
{
    void meow()
    {
        System.out.println("Cat meowssss...");
    }
}
class Inheritance1{
    public static void main(String args[]){
        Kitten c=new Kitten();
        c.meow();
        c.eat();
        Wolf d=new Wolf();
        d.bark();
        d.eat();
    }
}
