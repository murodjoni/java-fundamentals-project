import java.util.Scanner;

public class Ball {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String s = "11";
//Converting String to a primitive type (Int)
        int x = Integer.parseInt(s);
        System.out.println("Printing x from Integer.parseInt " + x);
//Converting double casted as int
        double pi = 3.7314;
        int iPi = (int) pi;
        System.out.println("Printing double casted as int " + iPi);
//Converting Int casted as Float
        int wholeNum = 7;
        float floatingtheWholeNum = (float) wholeNum;
        System.out.println("Printing Int casted as Float " + floatingtheWholeNum);
//Converting Int casted as double
        int intNum = 88;
        double doublingtheIntNum = (double) intNum;
        System.out.println("Printing Int casted as double " + doublingtheIntNum);

        //Converting String to a primitive type (short)
        String y = "100";
        short y1 = Short.parseShort(y);
        System.out.println("Printing y from short.parseShort " + y1);
        System.out.println("Enter a number homeboy: ");
        //Assigning the user's following integer input to xyz
        int xyz = scan.nextInt();
        //Using user's input in a sentence to feed it back to user
        System.out.println("You entered " + xyz + " homeboy!");
    }
    
    Ball b1 = new Ball(); 
    Ball b2 = b1; 

   
    
}
