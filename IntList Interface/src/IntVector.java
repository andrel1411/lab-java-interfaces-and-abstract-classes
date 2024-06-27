// IntVector Implementation
public class IntVector implements IntList {
    private int[] array;
    private int size;

    // Constructor
    public IntVector() {
        array = new int[20];
        size = 0;
    }

    // Add method
    @Override
    public void add(int number) {
        if (size == array.length) {
            // Create a new array double the size
            int[] newArray = new int[array.length * 2];
            // Copy elements to the new array
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size++] = number;
    }

    // Get method
    @Override
    public int get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException("Index: " + id + ", Size: " + size);
        }
        return array[id];
    }

    // Method to get the current size of the list
    public int size() {
        return size;
    }
}
