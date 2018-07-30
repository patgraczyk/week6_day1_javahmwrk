public class Runner {
    public static void main(String [] args) {
        Calculator newCalc=  new Calculator(5,5);
        newCalc.add();
        newCalc.subtract();
        newCalc.divide();
        newCalc.multiply();
    }
}
