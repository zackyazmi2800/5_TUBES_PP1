/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tubes;

/**
 *
 * @author zack
 */
public class StackMain {
    public static void main(String[] args) {
        StructurStack stack = new StructurStack(3);

        // Melakukan push 3x dengan transaksi
        System.out.println("Melakukan push 3x:");
        stack.push(new Transaction("TXN001", 1000000, "Deposit"));
        stack.push(new Transaction("TXN002", 50000, "Withdraw"));
        stack.push(new Transaction("TXN003", 20000, "Transfer"));

        // Setelah push 3x
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        stack.displayElements();

        // Melakukan pop 1x
        System.out.println("Melakukan pop 1x:");
        stack.pop();

        // Setelah pop 1x
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        stack.displayElements();
    }
}
