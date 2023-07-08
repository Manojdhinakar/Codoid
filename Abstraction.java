// Abstract parent class
abstract class Animals{
    // Abstract method
    public abstract void sound();
    public abstract void bite();

}
 abstract class Lion extends Animals{
    public void sound(){
        System.out.println("\n Roar");

    }
}
class Dog extends Lion{
    public void bite()
    {
        System.out.println("\n Bite");
    }
    public static void main(String args[]){
         Dog a=new Dog();
        a.sound();
        a.bite();
    }
}


