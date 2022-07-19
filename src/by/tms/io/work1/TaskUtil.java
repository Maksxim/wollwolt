package by.tms.io.work1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

public final class TaskUtil {

    private TaskUtil(){}

    public static String textInput() {
        Path path = Paths.get("resources", "Poem", "Pushkin.txt");
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

    public static int letterCount(String count){
        String str = TaskUtil.textInput();
        String counter = TaskUtil.textInput();
        counter =  counter.replace(count, "");
        int result = str.length() - counter.length();
        return result;
    }

    public static String calculationOfAllLetters(){
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l",
                "m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String count;
        int result;
        String str;
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < 26; ++i){
            count =(String) alphabet[i];
            result = TaskUtil.letterCount(count);
            builder.append(alphabet[i]).append(" = ").append(result).append("\n");
        }
        return str = builder.toString();
    }

    public static String outputText(){
        Path path = Paths.get("resources", "Poem", "PushkinLetter.txt");
        String str = TaskUtil.calculationOfAllLetters();
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


