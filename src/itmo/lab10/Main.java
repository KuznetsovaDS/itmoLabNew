package itmo.lab10;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Task newTask = new Task();
        String firstText = "src/itmo/lab10/firstText.txt";
        String addLine = "src/itmo/lab10/addLine.txt";
        String mixFiles = "src/itmo/lab10/mixFiles.txt";
        String changeSym = "src/itmo/lab10/changeSym.txt";

        try {
            List<String> file1 = newTask.readLines(firstText, 150);
            for (String line : file1){
                System.out.println(line);
            }
            newTask.writeToFile(addLine, "NEW LINE FOR TEXT");
            newTask.mixFiles(firstText, addLine, mixFiles);
            newTask.replaceSymbols(changeSym);
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
}
}
