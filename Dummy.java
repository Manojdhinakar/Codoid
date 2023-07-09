
public class Dummy {
        public int add(int a, int b) {
                // This is a dummy method for addition
                // It simply returns the sum of the two input numbers
                return a + b;
        }

        public static void main(String[] args) {
                Dummy calculator = new Dummy();
                int result = calculator.add(5, 3); // Calling the dummy method
                System.out.println("Result: " + result);
        }
}

