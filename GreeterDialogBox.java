import javax.swing.JOptionPane;
public class GreeterDialogBox {
    
    public void sayHello(){
        JOptionPane.showMessageDialog(null, 
        "Hello there! from the Dialog box", "Greeter Dialog Box" , 
        JOptionPane.INFORMATION_MESSAGE);
    }
}
