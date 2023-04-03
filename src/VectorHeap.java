import java.util.*;

/**
 * This class implements a priority queue using a vector heap data structure.
 * It implements the Prioridad interface.
 *
 * @param <E> the type of elements in the priority queue
 */
public class VectorHeap<E extends Comparable<E>> implements Prioridad<E> {

    /**
     * The data, kept in heap order.
     */
    protected Vector<E> data;

    /**
     * Constructs an empty priority queue.
     */
    public VectorHeap() {
        data = new Vector<E>();
    }

    /**
     * Constructs a priority queue from a vector.
     *
     * @param v the vector whose elements to add to the priority queue
     */
    public VectorHeap(Vector<E> v) {
        int i;
        data = new Vector<E>(v.size()); // we know ultimate size
        for (i = 0; i < v.size(); i++) { // add elements to heap
            add(v.get(i));
        }
    }

    /**
     * Returns the index of the parent of the given index.
     *
     * @param i the index whose parent to return
     * @return the index of the parent of the given index
     */
    protected static int parent(int i) {
        return (i - 1) / 2;
    }

    /**
     * Returns the index of the left child of the given index.
     *
     * @param i the index whose left child to return
     * @return the index of the left child of the given index
     */
    protected static int left(int i) {
        return 2 * i + 1;
    }

    /**
     * Returns the index of the right child of the given index.
     *
     * @param i the index whose right child to return
     * @return the index of the right child of the given index
     */
    protected static int right(int i) {
        return 2 * (i + 1);
    }

    /**
     * Moves the element at the given leaf index up the heap to its
     * correct position.
     *
     * @param leaf the index of the leaf to percolate up
     */
    protected void percolateUp(int leaf) {
        int parent = parent(leaf);
        E value = data.get(leaf);
        while (leaf > 0 && (value.compareTo(data.get(parent)) > 0)) {
            data.set(leaf, data.get(parent));
            leaf = parent;
            parent = parent(leaf);
        }
        data.set(leaf, value);
    }

    /**
     * Adds the given element to the priority queue.
     *
     * @param value the element to add to the priority queue
     */
    public void add(E value) {
        data.add(value);
        percolateUp(data.size() - 1);
    }

    /**
     * Moves the element at the given root index down the heap to its
     * correct position.
     *
     * @param root the index of the root to push down
     */
    protected void pushDownRoot(int root) {
        int heapSize = data.size();
        E value = data.get(root);
        while (root < heapSize) {
            int childpos = left(root);
            if (childpos < heapSize) {
                if ((right(root) < heapSize) &&
                        ((data.get(childpos + 1)).compareTo
                                (data.get(childpos)) > 0)) {
                    childpos++;
                }
                // Assert: childpos indexes bigger of two children
                if ((data.get(childpos)).compareTo
                        (value) > 0) {
                    data.set(root, data.get(childpos));
                    root = childpos; // keep moving down
                } else { // found right location
                    data.set(root, value);
                    return;
                }
            } else { // at a leaf! insert and return
                data.set(root, value);
                return;
            }
        }
    }

    public E remove() {
        E maxVal = getFirst();
        data.set(0, data.get(data.size() - 1));
        data.setSize(data.size() - 1);
        if (data.size() > 1) pushDownRoot(0);
        return maxVal;
    }

    public E getFirst() {
        return data.get(0);
    }

    public boolean isEmpty() {
        return data.size() == 0;
    }

    public int size() {
        return data.size();
    }

    public void clear() {
        data.clear();
    }

    public String toString() {
        return data.toString();
    }
}

