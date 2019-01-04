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
    
    public void getInput()
    {
        Console.WriteLine("Enter the first number: ");
        a = Convert.ToInt32(Console.ReadLine()); // Scans the next token of the input as an int.
                                                 //once finished
        Console.WriteLine("Enter the second number: ");
        b = Convert.ToInt32(Console.ReadLine()); // Scans the next token of the input as an int.
    }

    public static void main(String[] args)
    {
        SimpleCalc calc = new SimpleCalc();
        Console.WriteLine(calc.sum());
    }
}


