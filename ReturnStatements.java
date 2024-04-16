public class ReturnStatements {
    public static void main(String[] args) {
        String screaming = caps("WHICH WAY IS THE LIBRARY??");
        System.out.println(screaming);
    }

    public static String caps(String s){
        return s.toLowerCase();
    }
}
