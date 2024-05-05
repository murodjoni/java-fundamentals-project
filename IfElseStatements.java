import java.util.Scanner;

public class IfElseStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
        System.out.println("");
        System.out.println("Enter one of the following Fruit or Vegetable items and I will tell you if it's a Fruit, Vegetable or Neither: ");
        System.out.println("");
        System.out.println("orange, grapes, apple, potato, tomato, garlic, carrot, onion, pepper, phone, lamp, pencil, table, chair, etc");

        String userInput = scan.nextLine();
        
        //Using If statements to check if user entered fruit vegetable, or neither 
       if(userInput.equals("orange")){
        System.out.println(userInput + " is a fruit");
        }else if(userInput.equals("grapes")){
        System.out.println(userInput + " is a fruit");
        }else if(userInput.equals("apple")){
        System.out.println(userInput + " is a fruit");
        }else if (userInput.equals("potato")){
            System.out.println(userInput + " is a vegetable");
        }else if (userInput.equals("tomato")){
            System.out.println(userInput + " is a vegetable");
        }else if (userInput.equals("garlic")){
            System.out.println(userInput + " is a vegetable");
        }else if (userInput.equals("carrot")){
            System.out.println(userInput + " is a vegetable");
        }else if (userInput.equals("onion")){
            System.out.println(userInput + " is a vegetable");
        }else if (userInput.equals("pepper")){
            System.out.println(userInput + " is a vegetable");
        }else{
            System.out.println(userInput+ " is neither Fruit nor Vegetable");
        }    
        }
    }
       };
    