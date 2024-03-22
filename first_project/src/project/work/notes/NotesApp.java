package project.work.notes;

import project.work.utils.DateTimeUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NotesApp {
    public static void main(String[] args) {
        System.out.println("Введите заметку: ");
        Scanner sc = new Scanner(System.in);
        String note = sc.nextLine();

        String dateTime = DateTimeUtils.getDateTime();
        String entry = dateTime + " -> " + note;

        File file = new File("project.work.notes.txt");

        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(entry + "\n");
            fileWriter.close();
            System.out.println("Заметка добавлена");
        }
        catch (IOException e){
            System.out.println("Ошибка записи");
            e.printStackTrace();
        }
    }
}
