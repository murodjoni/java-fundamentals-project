import javax.swing.JOptionPane;
public class UserInputViaDialogBox {
    //This program takes user input using JOptionPane instead of using Scanner
    public static void main(String[] args) {
        String s;
        s = JOptionPane.showInputDialog("Enter a number");
        int x = Integer.parseInt(s);
        System.out.println("You entered " + x + ".");
    }
}
