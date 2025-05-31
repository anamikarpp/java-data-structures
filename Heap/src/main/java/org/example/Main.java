package org.example;

public class Main {
    public static void main(String[] args) {
        Heap maxHeap = new Heap(10,false);
        Heap minHeap = new Heap(10,true);
        maxHeap.insert(80);
        maxHeap.insert(75);
        maxHeap.insert(60);
        maxHeap.insert(68);
        maxHeap.insert(55);
        maxHeap.insert(40);
        maxHeap.insert(52);
        maxHeap.insert(67);

        maxHeap.printHeap();

        maxHeap.delete(0);
        maxHeap.printHeap();

        System.out.println(maxHeap.peek());

        minHeap.insert(80);
        minHeap.insert(75);
        minHeap.insert(60);
        minHeap.insert(68);
        minHeap.insert(55);
        minHeap.insert(40);
        minHeap.insert(52);
        minHeap.insert(67);

        minHeap.printHeap();
        System.out.println(minHeap.peek());
    }
}