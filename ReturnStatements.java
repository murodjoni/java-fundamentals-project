public class ReturnStatements {
    public static void main(String[] args) {
        String screaming = caps("hello there, can you hear me??");
        System.out.println(screaming);
    }

    public static String caps(String s){
        return s.toUpperCase();
    }
}
