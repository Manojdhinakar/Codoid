

interface Father
{
    String fname="xyz";
    void fwork();
}
interface Mother
{
    String mname="abc";
    void mwork();
}
class Son implements Father,Mother{
    String sname="name";
    String fwork_1;
    String mwork_1;
    public void fwork()
    {
         fwork_1="farmer";
    }
    public void mwork()
    {
         mwork_1="home";
    }
    void display()
    {
        System.out.println("son name:"+sname);
        System.out.println("father name:"+fname);
        System.out.println("father work:"+fwork_1);
        System.out.println("mother name:"+mname);
        System.out.println("mother work:"+mwork_1);
    }

}
class Inheritance{
    public static void main(String args[])
    {
        Son obj = new Son();
        obj.fwork();
        obj.mwork();
        obj.display();
    }
}

