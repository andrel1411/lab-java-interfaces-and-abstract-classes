public class IntListTest {
    public static void main(String[] args) {
        IntList intArrayList = new IntArrayList();
        IntList intVector = new IntVector();

        // Test IntArrayList
        for (int i = 0; i < 15; i++) {
            intArrayList.add(i);
        }
        System.out.println("IntArrayList elements:");
        for (int i = 0; i < 15; i++) {
            System.out.print(intArrayList.get(i) + " ");
        }
        System.out.println();

        // Test IntVector
        for (int i = 0; i < 25; i++) {
            intVector.add(i);
        }
        System.out.println("IntVector elements:");
        for (int i = 0; i < 25; i++) {
            System.out.print(intVector.get(i) + " ");
        }
        System.out.println();
    }
}
