import java.util.Scanner;

public class IfElseStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter something edible and I will try to guess if it's a Fruit, Vegetable or Neither: ");

        String userInput = scan.nextLine();

        //|| "apple" || "grapes" || "peaches", "pear", "bananas"
       if(userInput == "orange" ){
        System.out.println("Correct");
       }else if(userInput != "orange" ){
        System.out.println("INCORRECT");
       };
    }
}
