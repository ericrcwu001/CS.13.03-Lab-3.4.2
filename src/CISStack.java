import java.util.Arrays;

public class CISStack {

    // Array property.
    private Object[] arr;

    // Size property.
    private int size;

    // Pointer property
    private int pointer;

    // Constructor.
    public CISStack(int size) {
        arr = new Object[size];
        this.size = 0;
        pointer = -1;
    }

    // Push. This method pushes a value onto the top of the stack.
    public void push(int val) {
        arr[++pointer] = val;
        size++;
    }

    // Pop. This method pops a value from the top of the stack.
    public int pop() {
        int tmp = (int) arr[pointer];
        arr[pointer--] = null;
        size--;
        return tmp;
    }

    // isEmpty. Returns a boolean indicating whether the linked list is empty.
    public boolean isEmpty() {
        return size == 0;
    }

    // size. Returns the size of the queue.
    public int size() {
        return size;
    }

    // toString. Returns a description of the queue in, for example, the following format:
    // CISStack{stack=[7, 11], size=2, pointer=1}
    public String toString() {
        StringBuilder s = new StringBuilder("CISStack{stack=[");
        for (int i = 0; i < arr.length; ++i) {
            s.append(arr[i]);
            if (i < arr.length - 1) s.append(", ");
        }
        s.append("], size=");
        s.append(size);
        s.append(", pointer=");
        s.append(pointer);
        s.append("}");
        return s.toString();
    }
}
