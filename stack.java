// Interface for stack operations
interface StackOperations {
    void push(int item);
    int pop();
    void display();
}

// Class implementing fixed-length stack
class FixedStack implements StackOperations {
    private int[] stack;
    private int top;

    public FixedStack(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int item) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow - FixedStack");
        } else {
            stack[++top] = item;
	    System.out.println("The element "+stack[top]+" is pushed on to stack");
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow - FixedStack");
            return -1;
        }
        return stack[top--];
    }

    public void display() {
        System.out.print("FixedStack Elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

// Class implementing dynamic-length stack
class DynamicStack implements StackOperations {
    private int[] stack;
    private int top;

    public DynamicStack() {
        stack = new int[2]; // initial capacity
        top = -1;
    }

    public void push(int item) {
        if (top == stack.length - 1) {
            int[] newStack = new int[stack.length * 2];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
	    System.out.println("The Stack reaches to the maximum, will be resized");
        }
        stack[++top] = item;
        System.out.println("The element "+stack[top]+" is pushed on to stack");
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow - DynamicStack");
            return -1;
        }
        return stack[top--];
    }

    public void display() {
        System.out.print("DynamicStack Elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

// Class to test runtime binding
public class StackDemo {
    public static void main(String[] args) {
        StackOperations st;

        // Using FixedStack
        st = new FixedStack(3);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40); // Overflow
        st.display();
        System.out.println("Popped: " + st.pop());
	st.display();

        // Using DynamicStack
        st = new DynamicStack();
        st.push(100);
        st.push(200);
        st.push(300); // Should resize
        st.display();
        System.out.println("Popped: " + st.pop());
    }
}
