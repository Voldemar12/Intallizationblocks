package example2;

public class ArrayInitExample {
    private int[] array;

    {
        System.out.println("Перед конструктором");
        array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + i;
        }
        printInit(array);
        System.out.println();

    }

    private void printInit(int[] array) {
    }

    public ArrayInitExample() {
        System.out.println("В конструкторе");
        array = new int[10];
        for (int i = 0; i < array.length; i++ ) {
            array[i] = i + i;
        }
    }

    public void print() {
        for (int num : array) {
            System.out.printf("%d", num);
            System.out.print(String.format("%d ", num));

        }
    }
}
