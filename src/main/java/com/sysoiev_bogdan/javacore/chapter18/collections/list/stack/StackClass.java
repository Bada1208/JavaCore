package com.sysoiev_bogdan.javacore.chapter18.collections.list.stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackClass {
    static void showpush(Stack<Integer> stack, int a) {
        stack.push(a);
        System.out.println("push(" + a + ")");
        System.out.println("stack : " + stack);
    }

    static void showpop(Stack<Integer> stack) {
        System.out.print("pop -> ");
        Integer a = stack.pop();
        System.out.println(a);
        System.out.println("stack : " + stack);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("stack : " + stack);
        showpush(stack, 23);
        showpush(stack, 2333);
        showpush(stack, 23222);
        showpop(stack);
        showpop(stack);
        showpop(stack);
        try {
            showpop(stack);
        } catch (EmptyStackException e) {
            System.out.println("stack is empty");
        }
    }
}
