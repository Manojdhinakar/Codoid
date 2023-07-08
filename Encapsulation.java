class Person
{
    // Private field
    private int age;
    private String name;
    // Getter method
    public int getAge(){
     return age;
    }
    public String getName()
    {
        return name;
    }
    // Setter method
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setName(String strname)
    {
        this.name=strname;
    }
}

class Encapsulation {
    public static void main(String args[])
    {
        // Create an object of a person
        Person a1=new Person();
        // Change age using setter
        a1.setAge(19);
        a1.setName("Hero");
        // Access age and name using get method
        System.out.println("Name:"+a1.getName()+" "+"And"+" "+"Age:"+a1.getAge());
    }
}
