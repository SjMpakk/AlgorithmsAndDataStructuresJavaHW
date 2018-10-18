public class StackCommands {
    public static void Commands() {
        StackInterf stack = new StackImpl(5);

        StackImpl.addToStack(stack, 1);
        StackImpl.addToStack(stack, 2);
        StackImpl.addToStack(stack, 3);
        StackImpl.addToStack(stack, 4);
        StackImpl.addToStack(stack, 5);
        StackImpl.addToStack(stack, 6);
        StackImpl.addToStack(stack, 7);
        StackImpl.addToStack(stack, 8);
        System.out.println("Исходное значение стека");
        stack.display();
        System.out.println("Чтение элементов стека");
        stack.peek();
        stack.display();
        System.out.println("Удаление элемента стека");
        stack.pop();
        stack.display();


    }
}