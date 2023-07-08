class Polymorphism {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Polymorphism {
    public void animalSound() {
        System.out.println("The pig says wee wee");
    }
}

class Bat extends Polymorphism {
    public void animalSound() {
        System.out.println("The bat shouts");
    }
}
class Main {
    public static void main(String[] args) {
        Polymorphism myAnimal = new Polymorphism();  // Create a Animal object
        Polymorphism myPig = new Pig();  // Create a Pig object
        Polymorphism myBat = new Bat();  // Create a Bat object
        myAnimal.animalSound();
        myPig.animalSound();
        myBat.animalSound();
    }
}
