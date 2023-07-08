public class Multiinheri {
    void eat(){ // void means do not return anything
        System.out.println("eating");
    }
}
class Cat extends Multiinheri {
    void shout() {
        System.out.println("Shouting");
    }
}
class my extends Cat {
    void run() {
        System.out.println("running");
    }
    public static void main (String args[]){
        {
            Cat m1=new Cat();
            m1.eat();
            m1.shout();
        }
    }
}

