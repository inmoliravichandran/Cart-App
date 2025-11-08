/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author Keert
 */
public class Stack {
      private String[] stack;
    private int top;
    private int capacity;

    // Constructor
    public Stack(int capacity) {
        this.capacity = capacity;
        stack = new String[capacity];
        top = -1;
    }

    // Push a word onto the stack
    public void push(String word) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = word;
        }
    }

   // Pop the top element from the stack and return it
    public String pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return null;
        } else {
            return stack[top--];
        }
    }

  
    public String peek() {
        if (top == -1) {
            return null;
        } else {
            return stack[top];
        }
    }

    
    public boolean isEmpty() {
        return top == -1;
    }

   
    public int size() {
        return top + 1;
    }
}
