package itmo.lab10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task {
    public List<String> readLines(String path, int lineWidth) throws IOException {
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                for (int i = 0; i < line.length(); i += lineWidth) {
                    int lineEnd = (i + lineWidth) <= line.length() ? (i + lineWidth) : line.length();
                    lines.add(line.substring(i, lineEnd));
                }
            }
        }
        return lines;
    }
    public void writeToFile(String path2, String line) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path2, true))) {
            writer.write(line);
            writer.newLine();
            System.out.println("Строка записана");
        }
    }

    public void writeToFile(String path2, List<String> lines) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path2))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
    public void mixFiles(String path, String path2, String newFile) throws IOException {
        List<String> mixLines = new ArrayList<>();

        List<String> lines1 = readLines(path, 150);
        List<String> lines2 = readLines(path2, 150);

        mixLines.addAll(lines1);
        mixLines.addAll(lines2);

        writeToFile(newFile, mixLines);
        System.out.println("Файлы склеены");
    }

    public void replaceSymbols(String path3) throws IOException {
        List<String> lines = readLines(path3, 150);
        List<String> replaceSym = new ArrayList<>();
        for (String line : lines) {
            String replaceLine = line.replaceAll("[^\\p{L}0-9]", "\\$");
            replaceSym.add(replaceLine);
        }
        writeToFile(path3, replaceSym);
        System.out.println("Все кроме букв и цифр заменено на $");
    }
}

