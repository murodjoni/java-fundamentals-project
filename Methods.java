public class Methods {
    public static void main(String[] args) {
        welcome();
        //Printing a * b using the Multiply method
        multiply(6, 6);
        divide(20, 5);
        subtract(7, 6);
    }
    public static void welcome(){
        System.out.println("Welcome to our calculator!");
    }
    public static void multiply(int a, int b){
        System.out.println("Using multiply method: " + a * b);
    }
    public static void divide(int a, int b){
        System.out.println("Using divide method: " + a / b);
    }
    public static void subtract(int a, int b){
        System.out.println("Using subtraction method: " + (a - b));
    }
}
