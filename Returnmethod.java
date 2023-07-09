public class Returnmethod
{
    public int CompareNum()
    {
        int x = 3;
        int y = 8;
        if(x>y)
            return x;
        else
            return y;
    }
    public static void main(String args[])
    {
        Returnmethod obj = new Returnmethod();
        int result = obj.CompareNum();
        System.out.println("The greater number among x and y is: " + result);
    }
}