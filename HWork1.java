import java.util.Scanner;

public class HWork1 {
    // Task1:
    static int factorial(int n) {
        if (n < 0) {
            return -1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Task2
    static void printEvenNums(int[] numbers) {
        System.out.println("Чётные числа в переданной последовательности:");
        for (int i : numbers) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

    // Task3:
    static int sumDigits(int number) {
        String str = String.valueOf(number);
        String[] numbers = str.split("");
        int result = 0;
        for (String string : numbers) {
            Integer var = Integer.parseInt(string);
            result += var;
        }
        return result;
    }

    // Task4:
    static int findMaxOfTwo(int one, int two) {
        return one > two ? one : two; // тернарник
    }

    static int findMaxOfThree(int one, int two, int three) {
        return (findMaxOfTwo(one, two)) > three ? findMaxOfTwo(one, two) : three; // супер тернарник :D
    }

    public static void main(String[] args) {
        // Task 1
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число - посчитаем факториал: ");
        int n = sc.nextInt();
        int itresume_res = factorial(n);
        System.out.println("Факториал числа " + n + " = " + itresume_res);
        // Task2:
        int[] myNumbers = { 1, 4, 10, 22, 33, 15, 23, 67, 89, 90, 45, 20, 44 };
        int[] num100 = new int[100];
        for (int i = 0; i < num100.length; i++) {
            num100[i] = i + 7;
        }
        printEvenNums(myNumbers);
        printEvenNums(num100);
        // Task3:
        System.out.print("Введите число - посчитам сумму входящих в него чисел: ");
        // Scanner input = new Scanner(System.in);
        int digit = sc.nextInt();
        System.out.println(sumDigits(digit));
        // Task4:
        int[] inputs = new int[3];
        System.out.println("Введите 3 числа - выведем максимальное");
        for (int i = 0; i < inputs.length; i++) {
            int d = sc.nextInt();
            inputs[i] = d;
        }
        int result = findMaxOfThree(inputs[0], inputs[1], inputs[2]);
        System.out.print("Максимальное из введёных число = " + result);
        sc.close();
    }

}

