import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Счётчик верно указанных путей
        int validFileCount = 0;

        // Бесконечный цикл
        while (true) {
            // Запрос пути к файлу
            System.out.print("Введите путь к файлу: ");

            //Запрос пути в консоли можно таким образом:
            String path = new Scanner(System.in).nextLine();

            //Определение, существует ли файл, путь к которому был указан
            File file = new File(path);
            boolean fileExists = file.exists();

            //Определение, является ли указанный путь путём именно к файлу, а не к папке
            boolean isDirectoty = file.isDirectory();

            if (!fileExists || isDirectoty) {
                System.out.println("Файл не существует или указанный путь является путём к папке, а не к файлу");
                continue;
            } else {
                validFileCount++;
                System.out.println("Путь указан верно");
                System.out.println("Это файл номер " + validFileCount);
            }
        }
    }
}
