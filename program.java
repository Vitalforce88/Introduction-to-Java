/**
 * program
 */
import java.util.Scanner;// для получения данных из терминала
import java.io.FileWriter; // для работы с файлами
import java.io.IOException; // для работы с исключениями
public class program {

public static void main(String[] args) {

     // // Работа с пользовательским вводом(проверка на правильность ввода)
     // System.out.println("Всем привет! Я Java! Введи число: ");
     // Scanner input = new Scanner(System.in);
     // while(!input.hasNextInt()){
     //      System.out.printf("Пожалуйста введи число))): ");
     //      input.next(); // необходимо
     // }
     // int number = input.nextInt();
     // System.out.println("Привет! " + number);
     // input.close();

// Работа с файлами:

try(FileWriter fw = new FileWriter("file.txt",false)){
     fw.write("Line 1");
     fw.append("\n");
     fw.append("2");
     fw.write("Line 3");
     fw.flush();
}catch(IOException ex){
     System.out.println(ex.getMessage());
}

}

}