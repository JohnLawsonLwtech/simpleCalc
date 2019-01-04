import java.util.Scanner;

public class SimpleCalc {
    int a;
    int b;

    public SimpleCalc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public SimpleCalc(){
        getInput();
    }

    public int sum() {
        return a + b;
    }

    public void getInput() {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter the first number: ");
        a = reader.nextInt(); // Scans the next token of the input as an int.
//once finished
        System.out.println("Enter the second number: ");
        b = reader.nextInt(); // Scans the next token of the input as an int.
//once finished
        reader.close();
    }

    public static void main(String[] args) {
        SimpleCalc calc = new SimpleCalc();
        System.out.println(calc.sum());
    }
}


