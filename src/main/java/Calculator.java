public class Calculator {
    private int num1;
    private int num2;

public  Calculator(int num1, int num2){
    this.num1 = num1;
    this.num2 = num2;
}

public int getNum1(int num1) {
        return this.num1;
    }

public int getNum2(int num2) {
    return this.num2;
}

public void add(){
    System.out.println(num1 + num2);
}

public void subtract() {
    System.out.println(num1 - num2);
}

public void multiply() {
    System.out.println(num1 * num2);
}

public void divide() {
    System.out.println(num1 / num2);
}
}
