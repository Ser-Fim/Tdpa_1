import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Константа максимального размера массива (по заданию)
        final int MAX_SIZE = 15;
        int[] array = new int[MAX_SIZE];
        int n;

        // Ввод количества элементов
        System.out.print("Enter number of elements (max 15): ");
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        } else {
            System.out.println("Error: Invalid input.");
            return;
        }

        // Проверка ограничения (максимум 15 элементов)
        if (n > MAX_SIZE || n < 0) {
            System.out.println("Error: Number of elements must be between 0 and 15.");
            return;
        }

        // Ввод элементов массива
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            if (scanner.hasNextInt()) {
                array[i] = scanner.nextInt();
            } else {
                System.out.println("Error: Invalid element value.");
                return;
            }
        }

        // Вывод массива
        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Перенос строки в конце

        scanner.close();
    }
}import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Константа максимального размера массива (по заданию)
        final int MAX_SIZE = 15;
        int[] array = new int[MAX_SIZE];
        int n;

        // Ввод количества элементов
        System.out.print("Enter number of elements (max 15): ");
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        } else {
            System.out.println("Error: Invalid input.");
            return;
        }

        // Проверка ограничения (максимум 15 элементов)
        if (n > MAX_SIZE || n < 0) {
            System.out.println("Error: Number of elements must be between 0 and 15.");
            return;
        }

        // Ввод элементов массива
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            if (scanner.hasNextInt()) {
                array[i] = scanner.nextInt();
            } else {
                System.out.println("Error: Invalid element value.");
                return;
            }
        }

        // Вывод массива
        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Перенос строки в конце

        scanner.close();
    }
}