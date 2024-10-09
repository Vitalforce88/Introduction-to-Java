//=======================================================================================
// Задание 1. Удаление отрицательных значений из массива
// Реализуйте метод, который принимает на вход целочисленный массив и
// удаляет все отрицательные числа. Метод должен вернуть массив, содержащий
// только неотрицательные числа.
// Пример:
// [-1, 2, -3, 4, -5, 6]
// Результат:
// [2, 4, 6]
// =======================================================================================
// Задача 2. Уникальные числа
// Напишите метод, который принимает целочисленный массив и возвращает
// новый массив, содержащий только уникальные элементы из исходного
// массива.
// Пример:
// [1, 2, 2, 3, 4, 4, 5]
// Результат:
// [1, 2, 3, 4, 5]
//=========================================================================================
// Задача 3. Длина слов
// Реализуйте метод, который принимает на вход массив строк и возвращает
// новый массив, содержащий только строки, длина которых больше 3 символов.
// Пример:
// ["cat", "elephant", "dog", "giraffe"]
// Результат:
// ["elephant", "giraffe"]
//=========================================================================================
// Задача 4*. Среднее значение массива
// Напишите метод, который принимает массив целых чисел и возвращает
// среднее значение элементов массива, округленное до ближайшего целого
// числа.
// Пример:
// [4, 2, 7, 5, 1]
// Результат:
// 4
//==========================================================================================

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class HomeWork3 {

// 1:>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public static int[] filterNegative(int[] a) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : a) {
            if (num >= 0) {
                result.add(num);
            }
        }
        // Преобразуем ArrayList в массив
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }

    //2:>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public static Integer[] UniqElementsOf(int[] yourArray){
        LinkedHashSet<Integer> myHash = new LinkedHashSet<Integer>();
        for (Integer element : yourArray) {
            myHash.add(element);
        }
        
        Integer[] result = new Integer[myHash.size()];
        result = myHash.toArray(result);
        return result;
    }

    //3:>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public static String[] filterShortStrings(String[] arr) {
        ArrayList<String> result = new ArrayList<>();
        for (String s : arr) {
        if (s.length() > 3) {
        result.add(s);
        }
        }
        // Преобразуем ArrayList в массив
        String[] resultArray = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
        resultArray[i] = result.get(i);
        }
        return resultArray;
        }
    //4:>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public static int calculateAverage(int[] a) {
        if (a.length == 0) return 0;
        int sum = 0;
        for (int num : a) {
        sum += num;
        }
        return (int) Math.round((double) sum / a.length);
        }
    

    public static void main(String[] args) {

        //1:>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        int[] myArray = new int[]{-1, 2, -3, 4, -5, 6};
        int[] NewArray = filterNegative(myArray);
        System.out.println("Задание 1:");
        for (int i : NewArray) {
            System.out.print(i + " ");
        }
        //2:>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        int[] myArray2 = new int[]{1, 2, 2, 3, 4, 4, 5};
        Integer[] NewArray2 = UniqElementsOf(myArray2);
        System.out.println("\nЗадание 2:");
        for (Integer i : NewArray2) {
            System.out.print(i + " ");
        }
        //3:>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        String[] myArray3 = new String[]{"cat", "elephant", "dog", "giraffe"};
        String[] NewArray3 = filterShortStrings(myArray3);
        System.out.println("\nЗадание 3:");
        for (String i : NewArray3) {
            System.out.print(i + " ");
        }
        //4:>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        int[] myArray4 = new int[]{-1, 2, -3, 4, -5, 6};
        int Avarage = calculateAverage(myArray4);
        System.out.println("\nЗадание 4:\n" + Avarage);
    }

}
