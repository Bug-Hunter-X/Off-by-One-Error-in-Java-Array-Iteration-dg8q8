public class BugSolution {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }
        for (int value : array) {
            System.out.println(value);
        }
    }
}