//This application displays a hello world message
//by creating an instance of the Greeter class
//and calling the Greeter object's sayHello method
// Second portion displays a hello message by creating 
//instance of the GreeterDialogBox class and calling the sayHello method
public class HelloApp2 {
    
    public static void main(String[] args) {
        //Greeter myGreeterObject = new Greeter();
        //myGreeterObject.sayHello();

        //GreeterDialogBox dialogBoxHello = new GreeterDialogBox();
        //dialogBoxHello.sayHello2();

        Cashier ourCashier = new Cashier();
        ourCashier.sayHello();
        ourCashier.countMoney();
        ourCashier.giveMoney();
    }
}
