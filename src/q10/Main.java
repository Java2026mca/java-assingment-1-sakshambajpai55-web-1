import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] tokens = line.split(" ");

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {


            if (token.equals("+") || token.equals("-") || 
                token.equals("*") || token.equals("/")) {

                int b = stack.pop();
                int a = stack.pop();

                int result = 0;

                switch (token) {
                    case "+": result = a + b; break;
                    case "-": result = a - b; break;
                    case "*": result = a * b; break;
                    case "/": result = a / b; break;
                }

                stack.push(result);
            } 

            else {
                stack.push(Integer.parseInt(token));
            }
        }

        System.out.println(stack.pop());

        sc.close();
    }
}
