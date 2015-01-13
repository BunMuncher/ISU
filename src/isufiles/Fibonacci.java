package isufiles;


import TerminalIO.*;

public class Fibonacci {

    public static void main(String[] args) {
        KeyboardReader kr = new KeyboardReader();
        int fib;
        while (true) {
            fib = kr.readInt("Enter which number in the fibonacci sequence you want(max: 15): ");
            if(fib <=15 && fib >0)
                break;
        }
        System.out.println("Your number: " + fibonacci(fib));
    }

    public static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}
