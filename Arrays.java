public class Arrays {
    public static void main(String[] args) {

        Grocery();
    }

        public static void Grocery(){
        System.out.println("");
        System.out.println("Welcome to your local grocery store! \n");
        String groceryBag[] = {"Toilet Paper", "toothbrush", "water", "bananas", "bread", "coffee"};
        String paymentMethods[] = {"MasterCard", "Visa", "Cash", "ApplePay", "Crypto"};
        int invalidCashNotes[] = {50, 100};
        System.out.println("Cash notes that are not accepted at our Grocery Store: " + "$" + invalidCashNotes[0] + " bills and $" + invalidCashNotes[1] + " bills. \n");

        System.out.println("Available grocery items: ");
        System.out.println(groceryBag[0]);
        System.out.println(groceryBag[1]);
        System.out.println(groceryBag[2]);
        System.out.println(groceryBag[3]);
        System.out.println(groceryBag[4]);
        System.out.println(groceryBag[5] + "\n");

        System.out.println("These are the accepted payment methods: ");
        System.out.println(paymentMethods[0]);
        System.out.println(paymentMethods[1]);
        System.out.println(paymentMethods[2]);
        System.out.println(paymentMethods[3]);
        System.out.println(paymentMethods[4] + "\n");
        }
}
