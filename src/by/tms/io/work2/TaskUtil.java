package by.tms.io.work2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public final class TaskUtil {

    private TaskUtil(){}

    public static Object createFile(){
        Path path = Paths.get("resources", "random", "work1", "random.txt");
        File randomFile = new File(String.valueOf(path.toFile()));
        try {
            randomFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    public static String generateNumber(){
        Random rand = new Random();
        StringBuilder builder = new StringBuilder();
        int number;
        for(int i = 0; i < 100; ++i){
           number = rand.nextInt(9 + 1);
           builder.append(number).append(" ");
        }
        return builder.toString();
    }
    public static Object outputText(){
        Path path = Paths.get("resources", "random", "work1", "random.txt");
        String str = TaskUtil.generateNumber();
        try(FileOutputStream outputStream = new FileOutputStream(path.toFile())){
            outputStream.write(str.getBytes(StandardCharsets.UTF_8));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    public static String textInput() {
        Path path = Paths.get("resources", "random", "work1", "random.txt");
        String str;
        try (FileInputStream inputStream = new FileInputStream(path.toFile())) {
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes);
            str = new String(bytes);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return str;
    }
    public static String sortNumber(){
        String str = TaskUtil.textInput();
        String[] arr = str.split(" ");
        Arrays.sort(arr);
        String number = Arrays.toString(arr);
        number = number.replace(",", " ");
        return number;
    }
    public static String outputTextSort(){
        Path path = Paths.get("resources", "random", "work1", "random1.txt");
        File lastFile = new File(String.valueOf(path.toFile()));
        try {
            lastFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String str = TaskUtil.sortNumber();
        try(FileOutputStream outputStream = new FileOutputStream(path.toFile())){
            outputStream.write(str.getBytes(StandardCharsets.UTF_8));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return str;
    }
}
