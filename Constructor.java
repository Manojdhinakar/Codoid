class Cart1 {
    String Product;
    String Description;
    int Price;
    Cart1(String n, String m) {
        Product = n;
        Description = m;
    }
    Cart1(String n, String m, int i) {
        Product = n;
        Description = m;
        Price = i;
    }
    void display() {
        System.out.println(Product + "" + Description + "" + Price);
    }
        public static void main(String args[]){
            Cart1 s1 = new Cart1("mobile", "with 5g support");
            Cart1 s2 = new Cart1("Laptop", "With smart WiFi support", 50000);
            s1.display();
            s2.display();
        }
    }




