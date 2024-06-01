/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tubes;

/**
 *
 * @author zack
 */
public class StructurStack {
    private Transaction[] array;
    private int capacity;
    private int TOP;
    public final int MIN = -1;
    
    public boolean isEmpty() {
        return (TOP == MIN);
    }

    public boolean isFull() {
        return (TOP == capacity - 1);
    }

    public int size() {
        return TOP + 1;
    }

    public Transaction top() {
        if (isEmpty()) {
            return null;
        } else {
            return array[TOP];
        }
    }
    
    public void push(Transaction data) {
        if (isFull()){
            System.out.println("Stack Penuh");
        } else {
            TOP++;
            array[TOP] = data;
        }
    }
    
    public Transaction pop() {
        if (isEmpty()) {
            System.out.println("Stack Kosong");
            return null;
        } else {
            Transaction poppedElement = array[TOP];
            TOP--;
            return poppedElement;
        }
    }
    
    public StructurStack (int capacity) {
        super();
        array = new Transaction[capacity];
        this.capacity = capacity;
        TOP = MIN;
    }
    
    public void displayElements() {
        System.out.println("Elemen From TOP: ");
        if (isEmpty()) {
            System.out.println("Stack kosong");
        } else {
            for (int i = TOP; i >= 0; i--) {
                System.out.println(array[i]);
            }
        }
        System.out.println();
    }
}
