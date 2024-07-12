package OOP;

public class ArrayInJava {
    // Arrays are objects in Java.
    // They are a non-primitive data type and are stored in the heap.
    // They are also called reference variables.
    // Continuous memory allocation.
    // The size is fixed and cannot be modified or changed.
    // Traverse through indexes in case of search or insertion.
    // Cannot store different data types in one array.

    public static void main(String[] args) {
        // Initialize first array with values
        int firstArray[] = {3, 4, 5};
        System.out.print("First array: ");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + " ");
        }
        System.out.println();

        // Initialize second array with a fixed size and assign values
        int secondArray[] = new int[3];
        secondArray[0] = 1;
        secondArray[1] = 2;
        secondArray[2] = 3;
        System.out.print("Second array: ");
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i] + " ");
        }
        System.out.println();

        // Initialize a 2D array (third array) with values
        int thirdArray[][] = {{1, 2, 3}, {2, 3, 4}};
        System.out.println("Third array:");
        for (int i = 0; i < thirdArray.length; i++) {
            for (int j = 0; j < thirdArray[i].length; j++) {
                System.out.print(thirdArray[i][j] + " ");
            }
            System.out.println();
        }

        // Initialize a 2D array (fourth array) with a fixed size and assign values
        int fourthArray[][] = new int[3][4];
        for (int i = 0; i < fourthArray.length; i++) {
            for (int j = 0; j < fourthArray[i].length; j++) {
                fourthArray[i][j] = 1;
            }
        }
        System.out.println("Fourth array:");
        for (int i = 0; i < fourthArray.length; i++) {
            for (int j = 0; j < fourthArray[i].length; j++) {
                System.out.print(fourthArray[i][j] + " ");
            }
            System.out.println();
        }

        // Initialize a jagged array (fifth array)
        int fifthArray[][] = new int[3][];
        fifthArray[0] = new int[1];
        fifthArray[1] = new int[1];
        fifthArray[2] = new int[1];  // Changed the index from 3 to 2 to avoid ArrayIndexOutOfBoundsException
        fifthArray[0][0] = 1;
        fifthArray[1][0] = 2;
        fifthArray[2][0] = 3;
        System.out.println("Fifth (Jagged) array:");
        for (int i = 0; i < fifthArray.length; i++) {
            for (int j = 0; j < fifthArray[i].length; j++) {
                System.out.print(fifthArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
