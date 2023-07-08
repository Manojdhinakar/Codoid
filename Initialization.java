
class Cart {

    String ProductName;
    String Description;
    int price;

    void insertRecord(String n, String m, int r) {
        ProductName = n;
        Description = m;
        price = r;

    }

    void displayInFo() {
        System.out.println(ProductName + " " + Description + " " + price);
    }
}
    class main1 {
        public static void main(String args[]) {
            Cart s1 = new Cart();
            Cart s2 = new Cart();
            s1.insertRecord("mobile", "with5g", 20000);
            s2.insertRecord("laptop", "With smart Wifi connect", 50000);
            s1.displayInFo();
            s2.displayInFo();
        }
    }



