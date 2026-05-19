import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // ================= Задача 1 =================
        System.out.println("Задача 1:");
        int[] inputArray1 = {15000, 20000, 12000, 30000, 25000};

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int value : inputArray1) {
            sum += value;
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }

        float average = (float) sum / inputArray1.length;

        float[] outputArray1 = {sum, max, min, average};

        System.out.println("inputArray1: " + Arrays.toString(inputArray1));
        System.out.println("outputArray1: " + Arrays.toString(outputArray1));

        System.out.println();

        // ================= Задача 2 =================
        System.out.println("Задача 2:");
        int[] inputArray2 = {50000, 60000, 45000, 70000, 55000};
        float[] outputArray2 = new float[inputArray2.length];

        int index2 = 0;
        for (int salary : inputArray2) {
            outputArray2[index2++] = salary * 0.13f;
        }

        System.out.println("inputArray2: " + Arrays.toString(inputArray2));
        System.out.println("outputArray2: " + Arrays.toString(outputArray2));

        System.out.println();

        // ================= Задача 3 =================
        System.out.println("Задача 3:");
        int[] inputArray3 = {4500, 5000, 7000, 3000, 8000};
        boolean[] outputArray3 = new boolean[inputArray3.length];

        int index3 = 0;
        for (int bonus : inputArray3) {
            outputArray3[index3++] = bonus > 5000;
        }

        System.out.println("inputArray3: " + Arrays.toString(inputArray3));
        System.out.println("outputArray3: " + Arrays.toString(outputArray3));

        System.out.println();

        // ================= Задача 4 =================
        System.out.println("Задача 4:");
        int[] inputArray4 = {10000, 5000, -2000, 3000, 0};
        boolean[] outputArray4 = new boolean[1];
        outputArray4[0] = true;

        for (int balance : inputArray4) {
            if (balance < 0) {
                outputArray4[0] = false;
                break;
            }
        }

        System.out.println("inputArray4: " + Arrays.toString(inputArray4));
        System.out.println("outputArray4: " + Arrays.toString(outputArray4));

        System.out.println();

        // ================= Задача 5 =================
        System.out.println("Задача 5:");
        int[] inputArray5 = {150000, -20000, 300000, 0, 50000};
        int[] outputArray5 = new int[1];

        for (int profit : inputArray5) {
            if (profit > 0) {
                outputArray5[0]++;
            }
        }

        System.out.println("inputArray5: " + Arrays.toString(inputArray5));
        System.out.println("outputArray5: " + Arrays.toString(outputArray5));
    }
}