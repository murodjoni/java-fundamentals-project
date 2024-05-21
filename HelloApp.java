public class HelloApp {
    
    static String favoriteColor;
    
    public static void main(String[] args) {
        System.out.println("Hello with a new line afterward \n");
        System.out.println("Hello with a backspace afterward \b");
        System.out.println("\"Hello with a double quote wrapped text\"");
        System.out.println("line 1 \nline 2\nline 3");
        System.out.println("Hello with a form feed afterward \f");
        printHello("world");
        myFaveColor();
    }

    public static void printHello(String greeting){
        System.out.println("Hello " + greeting);
    }

    public static void myFaveColor(){
        favoriteColor = "Yellow";
        System.out.println("my favorite color is " + favoriteColor);
    }
    
}

