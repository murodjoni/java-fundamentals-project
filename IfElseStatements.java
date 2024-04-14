import java.util.Scanner;

public class IfElseStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter one of the following Fruit or Vegetable items and I will tell you if it's a Fruit, Vegetable or Neither: ");

        System.out.println("orange, grapes, apple, potato, tomato, garlic, carrot, onion, pepper, phone, lamp, pencil, table, chair");

        String userInput = scan.nextLine();

        //Using If statements to check if user entered fruit vegetable, or neither 
       if(userInput == "orange"){
        System.out.println(userInput + " is a fruit");
       }else if(userInput == "grapes"){
        System.out.println(userInput + " is a fruit");
        }else if(userInput == "apple"){
        System.out.println(userInput + " is a fruit");
        }else if (userInput == "potato"){
            System.out.println(userInput + " is a vegetable");
        }else if (userInput == "tomato"){
            System.out.println(userInput + " is a vegetable");
        }else if (userInput == "garlic"){
            System.out.println(userInput + " is a vegetable");
        }else if (userInput == "carrot"){
            System.out.println(userInput + " is a vegetable");
        }else if (userInput == "onion"){
            System.out.println(userInput + " is a vegetable");
        }else if (userInput == "pepper"){
            System.out.println(userInput + " is a vegetable");
        }else{
            System.out.println(userInput+ " is neither Fruit nor Vegetable");
        }    
        
    }
       };
    