public class Main {
    public static void main(String[] args) {
        // Задача 1
        int[] arr = new int[]{1, 2, 3};
        double[] arr1 = new double[]{1.57, 7.654, 9.986};
        String[] arr2 = new String[]{"Hello", "world", "!"};

        // Задача 2
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println("\n------");
        for (double v : arr1) {
            System.out.print(v + ", ");
        }
        System.out.println("\n------");
        for (String string : arr2) {
            System.out.print(string + ", ");
        }

        System.out.println();
        System.out.println();

        // Задача 3
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\n------");
        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println("\n------");
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i] + ", ");
        }

        System.out.println();
        System.out.println();

        // Задача 4
        for (int i : arr) {
            i += 1;
            System.out.print(i + ", ");
        }
    }
}