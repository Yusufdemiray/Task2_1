import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);

        Value value = new Value(inp.nextInt(), inp.nextInt(), inp.nextInt());

        Calculator calculator = new Calculator();
        calculator.Gather(value);


    }
}