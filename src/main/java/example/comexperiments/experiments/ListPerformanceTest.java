package example.comexperiments.experiments;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformanceTest {
    public static void main(String[] args) {
        int numElements = 100000;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        DecimalFormat formatter = new DecimalFormat("#,###");

        // Test insertion into beginning for ArrayList
        long arrayListInsertionStartTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            arrayList.add(0, i);
        }
        long arrayListInsertionEndTime = System.nanoTime();
        System.out.println("ArrayList insertion into beginning time: " +
                formatter.format(arrayListInsertionEndTime - arrayListInsertionStartTime) + " ns");

        // Test insertion into beginning for LinkedList
        long linkedListInsertionStartTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            linkedList.addFirst(i);
        }
        long linkedListInsertionEndTime = System.nanoTime();
        System.out.println("LinkedList insertion into beginning time: " +
                formatter.format(linkedListInsertionEndTime - linkedListInsertionStartTime) + " ns");

        // Test access by index for ArrayList
        long arrayListAccessStartTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            arrayList.get(i);
        }
        long arrayListAccessEndTime = System.nanoTime();
        System.out.println("ArrayList access by index time: " +
                formatter.format(arrayListAccessEndTime - arrayListAccessStartTime) + " ns");

        // Test access by index for LinkedList
        long linkedListAccessStartTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            linkedList.get(i);
        }
        long linkedListAccessEndTime = System.nanoTime();
        System.out.println("LinkedList access by index time: " +
                formatter.format(linkedListAccessEndTime - linkedListAccessStartTime) + " ns");

        // Test removal of first element for ArrayList
        long arrayListRemovalStartTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            arrayList.remove(0);
        }
        long arrayListRemovalEndTime = System.nanoTime();
        System.out.println("ArrayList removal of first element time: " +
                formatter.format(arrayListRemovalEndTime - arrayListRemovalStartTime) + " ns");

        // Test removal of first element for LinkedList
        long linkedListRemovalStartTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            linkedList.removeFirst();
        }
        long linkedListRemovalEndTime = System.nanoTime();
        System.out.println("LinkedList removal of first element time: " +
                formatter.format(linkedListRemovalEndTime - linkedListRemovalStartTime) + " ns");
    }
}
