import java.io.*;
public class Seminar2 {
    //Метод для получения массива строк со списком имён файлов в переданном пути(полном) к папке
    public static String[] CreateFileslist(String path){
        File folder = new File(path);
        if(folder.isFile()){
            return new String[0];
        }
        File[] listFiles = folder.listFiles();
        String[] FileNamesList = new String[listFiles.length];
        for (int i = 0; i < FileNamesList.length; i++) {
            FileNamesList[i] = listFiles[i].getName();
        }
        return FileNamesList;
    }

    public static void writeToFile(String in, String out){
        String[] names = CreateFileslist(in);
        FileWriter fw = null;// обьявили чтобы был виден вне блока Try
        try{
            fw = new FileWriter(out);
            for (String name : names) {
                fw.write(name + "\n");                
            }
            fw.flush();
        }catch(IOException exep){
            throw new RuntimeException("Извините запись в файл не удалась" + exep.getMessage());
        }
        finally{
            try{
                fw.close();
            }catch(IOException ex){
                throw new RuntimeException("Не удалось закрыть файл"+ ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        writeToFile("C:\\Users\\User\\Music\\Nickelback Get Rolling(Deluxe)(2023)", "Nickelback-GetRolling.txt");
    }
}
