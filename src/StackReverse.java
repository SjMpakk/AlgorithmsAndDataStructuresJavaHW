import java.util.Stack;

public class StackReverse {
    public static void Reverse() {
        String str = "123456";

        Stack stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        } while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        } if (true)
            return;
    }
}
