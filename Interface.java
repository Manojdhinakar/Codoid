// Define an interface
interface Livings
{
    void eat();
    void sleep();

}
class Puppy implements Livings
{
    @Override
    public void eat(){
        System.out.println("Puppy is eating");
    }
    @Override
    public void sleep()
    {
        System.out.println("Puppy is sleeping");
    }
    // Implement the interface in another class Eg: Cat like Dog

}

public class Interface {
    public static void main(String args[]){
        Puppy puppy=new Puppy();
        puppy.eat();
        puppy.sleep();
    }
}
