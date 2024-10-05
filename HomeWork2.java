import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class HomeWork2 {

    // public static StringBuilder URLBuild(String BaseURL,String input){
    // StringBuilder url = new StringBuilder(BaseURL);
    // String[] keyV = input.split("&");
    // for (String string : keyV) {
    // if((string.split("="))[1] == "null"){
    // continue;
    // }
    // else url.append(string).append("&");
    // }
    // return url.trim(&);
    // }
    // 1:
    public static String buildURL(String baseURL, String params) {
        StringBuilder url = new StringBuilder(baseURL);
        String[] pairs = params.split("&");
        for (int i = 0; i < pairs.length; i++) {
            String[] keyValue = pairs[i].split("=");
            if (!"null".equals(keyValue[1])) {
                if (i > 0) {
                    url.append("&");
                }
                url.append(keyValue[0]).append("=").append(keyValue[1]);
            }
        }
        return url.toString();
    }

    // 2:
    public static String generateCSV(String[] headers, String[][] data) {
        StringBuilder csv = new StringBuilder();
        // Добавление заголовков
        csv.append(String.join(",", headers)).append("\n");
        // Добавление данных
        for (String[] row : data) {
            csv.append(String.join(",", row)).append("\n");
        }
        return csv.toString().trim(); // Удалить последнюю новую строку
    }

    // 3:
    public static String removeEmptyLines(String text) {
        String[] lines = text.split("\n");
        StringBuilder cleanedText = new StringBuilder();
        for (String line : lines) {
            if (!line.trim().isEmpty()) {
                if (cleanedText.length() > 0) {
                    cleanedText.append("\n");
                }
                cleanedText.append(line);
            }
        }
        return cleanedText.toString();
    }

    // 4:
    private static File log;
    private static FileWriter fileWriter;

    public static void findMinMax(int[] arr) {
        try {
            log = new File("log.txt");
            log.createNewFile();
            fileWriter = new FileWriter(log);
            int min = arr[0];
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
                if (arr[i] > max) {
                    max = arr[i];
                }
                logStep(min, max);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void logStep(int min, int max) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            String timestamp = dateFormat.format(new Date());
            fileWriter.write(timestamp + " " + min + ", " + max +
                    "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // String input = "Head First Java";
        // input = input.toLowerCase();
        // System.out.println(String.format("@@@===%s===@@@",input));

        // 1:
        System.out.println(buildURL("www.great", "query=java&sort=desc&filter=null"));
        // System.out.println(URLBuild("www.great",
        // "query=java&sort=desc&filter=null"));

        // 2:
        String[] headers = { "Name", "Age", "City" };
        String[][] data = {
                { "John", "30", "New York" },
                { "Alice", "25", "Los Angeles" },
                { "Bob", "35", "Chicago" }
        };
        System.out.println(generateCSV(headers, data));

        // 3:
        String text = "line1\n\nline2\n\nline3";
        System.out.println(removeEmptyLines(text));

        // 4:

    }

}
