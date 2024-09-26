
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import Lesson_1.Animal;

public class mainProgram {

    public static void main(String[] args){
        Animal cat = new Animal("Маккей", 1);

        System.out.println(cat.name);
        // Task1:
        LocalTime now = LocalTime.now();// time
        System.out.println(now); //print time
        LocalDateTime dayTimeNow = LocalDateTime.now();
        System.out.println(dayTimeNow);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("===HH:mm:ss===\n**************\n===dd.mm.yy===");
        System.out.println(formatter.format(dayTimeNow));
    }



}
 