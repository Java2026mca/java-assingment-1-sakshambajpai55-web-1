import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int[] stack = new int[n];
        int top = -1;

        for (int i = 0; i < n; i++) {
            String command = sc.next();

            switch (command) {

                case "PUSH":
                    int x = sc.nextInt();
                    if (top < n - 1) {
                        stack[++top] = x;
                    }
                    break;

                case "POP":
                    if (top == -1) {
                        System.out.println("EMPTY");
                    } else {
                        System.out.println(stack[top--]);
                    }
                    break;

                case "PEEK":
                    if (top == -1) {
                        System.out.println("EMPTY");
                    } else {
                        System.out.println(stack[top]);
                    }
                    break;

                case "SIZE":
                    System.out.println(top + 1);
                    break;
            }
        }

        sc.close();
    }
}
