import java.util.Random;

public class ForLoops{
    public static void main(String[] args) {
        //Printing text 9 times
        for(int i = 0; i < 9; i++){
            System.out.println("I think, therefore I am");
        }
        //Printing all numbers 0-4
        for(int i = 0; i <= 4; i++){
            System.out.println(i);
        }
        
        //Printing numbers included in an array
        int[] ages = {0, 1, 2, 7, 8, 9};
        for( int i = 0; i < ages.length; i++){
            System.out.println("Number: " + ages[i]);
        }

        Random rand = new Random();

        //Printing random number up to 15, (not including 15)
        int randomNum = rand.nextInt(15);
        System.out.println("The random num from array is: " + randomNum);
        
    }
}