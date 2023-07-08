class Animal{
       void eat(){ // void means do not return anything
        System.out.println("eating");
    }
}
class dog extends Animal{
    void bark(){
        System.out.println("Barking");
    }
        public static void main (String args[]){
            {
                dog m1=new dog();
                m1.eat();
                m1.bark();
            }
    }
}
