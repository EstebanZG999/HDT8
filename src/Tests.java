import org.junit.Test;
import static org.junit.Assert.*;

public class Tests {

    @Test
    public void testAddAndRemove() {
        // create a new VectorHeap
        VectorHeap<Integer> heap = new VectorHeap<>();

        // add some elements to the heap
        heap.add(3);
        heap.add(2);
        heap.add(1);

        // check that the elements were added in the correct order
        assertEquals("[3, 2, 1]", heap.toString());

        // remove an element and check that it is the largest
        int removed = heap.remove();
        assertEquals(3, removed);

        // check that the heap now contains the remaining elements
        assertEquals("[2, 1]", heap.toString());

        // add another element
        heap.add(4);

        // check that the heap now contains the new element and the remaining elements
        assertEquals("[4, 1, 2]", heap.toString());

        // remove all elements from the heap and check that they are removed in the correct order
        assertEquals(4, (int) heap.remove());
        assertEquals(2, (int) heap.remove());
        assertEquals(1, (int) heap.remove());

        // check that the heap is now empty
        assertTrue(heap.isEmpty());
    }
}
