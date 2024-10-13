// Задание 1. Удаление нечетных строк
// Дан LinkedList с несколькими элементами. В методе
// removeOddLengthStrings класса LLTasks реализуйте удаление строк, длина
// которых нечетная. Используйте LinkedList и стандартные методы.
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
// Задача 2. Реализация стека
// Реализуйте MyStack с использованием LinkedList с методами:
// ● push(String element) - добавляет элемент на вершину стека
// ● pop() - возвращает элемент с вершины и удаляет его
// ● peek() - возвращает элемент с вершины, не удаляя
// ● getElements() - возвращает все элементы стека
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
// Задача 3. Количество вхождений слова
// Реализуйте метод countOccurrences в классе ListUtils, который
// принимает LinkedList<String> и строку, и возвращает количество
// вхождений строки в список
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
// Задача 4. Сдвиг очереди
// Реализуйте метод rotateDeque в классе DequeTasks, который принимает
// Deque<Integer> и число n. Метод должен повернуть очередь вправо на n
// позиций. Если n отрицательное, повернуть влево.

import java.util.Deque;
import java.util.LinkedList;

public class HomeWork4 {

    // 1:
    public static void removeOddLengthStrings(LinkedList<String> LList) {
        LinkedList<String> toRemove = new LinkedList<>();
        for (String s : LList) {
            if (s.length() % 2 != 0) {
                toRemove.add(s);
            }
        }
        LList.removeAll(toRemove);
    }

    // 2:
    class MyStack {
        private LinkedList<String> stack = new LinkedList<>();

        public void push(String element) {
            stack.addFirst(element);
        }

        public String pop() {
            return stack.removeFirst();
        }

        public String peek() {
            return stack.peekFirst();
        }

        public LinkedList<String> getElements() {
            return new LinkedList<>(stack);
        }
    }

    // 3:
    public static int countOccurrences(LinkedList<String> list, String value) {
        int count = 0;
        for (String s : list) {
            if (s.equals(value)) {
                count++;
            }
        }
        return count;
    }

    // 4:
    public static void rotateDeque(Deque<Integer> deque, int n) {
        if (deque.isEmpty()) return;
        int size = deque.size();
        n = n % size;
        if (n < 0) {
            n += size;
        }
        for (int i = 0; i < n; i++) {
            deque.addLast(deque.removeFirst());
        }
        System.out.println(deque);
    }

    public static void main(String[] args) {
        // ...используем методы и классы описанные выше

    }
}
