package stack;

public class stack {
    int top;
    int[] stack;
    int n;

    stack(int size) {
        n = size;
        stack = new int[n];
        top = -1;
    }

    void push(int value) {
        if (top == n - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[++top] = value;
        }

    }

    void pop(){
        if(top == -1){
            System.out.println("stack is underflow");
        }stack[top--] =0;
    }

    void peek(){
        if(top == -1){
            System.out.println("stack is empty");
        }
    }
}


