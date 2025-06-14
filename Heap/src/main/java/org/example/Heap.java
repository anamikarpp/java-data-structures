package org.example;

public class Heap {

    private boolean isMinHeap;
    private int[] heap;
    private int size;

    public Heap(int capacity,boolean isMinHeap)
    {
        heap = new int[capacity];
        this.isMinHeap=isMinHeap;
    }

    public void insert(int value)
    {
        if(isFull())
        {
            throw new IndexOutOfBoundsException("Heap is full");
        }
        heap[size]=value;
        fixHeapAbove(size);
        size++;
    }

    public int delete(int index)
    {
        if(isEmpty())
        {
            throw new IndexOutOfBoundsException("Heap is Empty");
        }

        int parent = getParent(index);
        int deletedValue = heap[index];

        heap[index]=heap[size-1];

        if(index== 0 || heap[index]<heap[parent]){
            fixHeapBelow(index,size-1);
        }
        else {
            fixHeapAbove(index);
        }
        size--;
        return deletedValue;
    }

    public int peek()
    {
        if(isEmpty())
        {
            throw  new IndexOutOfBoundsException("Heap is empty");
        }
        return heap[0];
    }

    private void fixHeapBelow(int index,int lastHeapIndex)
    {
        int childToSwap;
        while(index<=lastHeapIndex)
        {
            int leftChild = getChild(index,true);
            int rightChild= getChild(index,false);
            if(leftChild<=lastHeapIndex) {
                if (rightChild > lastHeapIndex) {
                    childToSwap = leftChild;
                }
                else {
                    childToSwap = (compare(heap[leftChild] ,heap[rightChild]) ? rightChild: leftChild);
                }

                if (compare(heap[index],heap[childToSwap])) {
                    int tmp = heap[index];
                    heap[index] = heap[childToSwap];
                    heap[childToSwap] = tmp;
                } else {
                    break;
                }
                index=childToSwap;
            }
            else
            {
                break;
            }
        }
    }

    private void fixHeapAbove(int index)
    {
        int newValue=heap[index];
        while(index>0 && compare(heap[getParent(index)],newValue))
        {
            heap[index]=heap[getParent(index)];
            index=getParent(index);
        }
        heap[index]=newValue;
    }

    private boolean compare(int parent,int child)
    {
        return isMinHeap?parent>child:parent<child;
    }

    public void printHeap(){
        for(int i=0;i<size;i++)
        {
            System.out.print(heap[i]+",");
        }
        System.out.println();
    }

    public boolean isFull()
    {
        return size==heap.length;
    }

    public int getParent(int index)
    {
        return (index-1)/2;
    }

    public boolean isEmpty()
    {
        return size==0;
    }

    public int getChild(int index,boolean left)
    {
        return 2*index +(left?1:2);
    }

}
