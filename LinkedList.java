/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author julio
 */
public class LinkedList {
    private Node head;
    private final boolean isDoubly;
    private final boolean isCircular;

    public LinkedList(boolean isDoubly, boolean isCircular) {
        this.head = null;
        this.isDoubly = isDoubly;
        this.isCircular = isCircular;
    }

    public void insert(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            if (isCircular) head.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != null && (!isCircular || temp.next != head)) {
            temp = temp.next;
        }
        temp.next = newNode;
        if (isDoubly) newNode.prev = temp;
        if (isCircular) newNode.next = head;
    }

    public void delete(Object data) {
        if (head == null) {
            System.out.println("La lista está vacía.");
            return;
        }
        Node temp = head;
        Node prev = null;
        do {
            if (temp.data.equals(data)) {
                if (prev != null) {
                    prev.next = temp.next;
                    if (isDoubly && temp.next != null) temp.next.prev = prev;
                } else {
                    head = temp.next;
                    if (isCircular && head != null) {
                        Node last = head;
                        while (last.next != temp) last = last.next;
                        last.next = head;
                    }
                }
                System.out.println("Elemento eliminado: " + data);
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != null && (!isCircular || temp != head));
        System.out.println("Elemento no encontrado.");
    }

    public boolean search(Object data) {
        if (head == null) return false;
        Node temp = head;
        do {
            if (temp.data.equals(data)) return true;
            temp = temp.next;
        } while (temp != null && (!isCircular || temp != head));
        return false;
    }

    public void display() {
        if (head == null) {
            System.out.println("La lista está vacía.");
            return;
        }
        Node temp = head;
        System.out.print("Elementos: ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != null && (!isCircular || temp != head));
        System.out.println();
    }
}