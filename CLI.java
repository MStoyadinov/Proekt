import java.util.Scanner;

public class CLI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        String filename = null;
        boolean fileSaved = false;

        while (!exit) {
            System.out.print("Въведете команда: ");
            String command = scanner.nextLine();

            switch (command) {
                case "open":
                    System.out.print("Въведете име на файла за отваряне: ");
                    filename = scanner.nextLine();
                    fileSaved = true;
                    System.out.println("Отворен файл: " + filename);
                    break;
                case "close":
                    if (!fileSaved) {
                        System.out.println("Файлът не е запазен.");
                    }
                    filename = null;
                    fileSaved = false;
                    System.out.println("Файлът е затворен.");
                    break;
                case "save":
                    if (filename == null) {
                        System.out.println("Файлът не е отворен.");
                    } else {
                        fileSaved = true;
                        System.out.println("Файлът е запазен.");
                    }
                    break;
                case "save as":
                    System.out.print("Въведете име на файла за запазване: ");
                    filename = scanner.nextLine();
                    fileSaved = true;
                    System.out.println("Файлът е запазен като " + filename);
                    break;
                case "help":
                    System.out.println("open - отваря файл");
                    System.out.println("close - затваря файл");
                    System.out.println("save - запазва текущия файл");
                    System.out.println("save as - запазва файл като ново име");
                    System.out.println("help - показва тази помощ");
                    System.out.println("exit - излиза от програмата");
                    break;
                case "exit":
                    if (!fileSaved) {
                        System.out.println("Файлът не е запазен.");
                    }
                    System.out.println("Довиждане!");
                    exit = true;
                    break;
                default:
                    System.out.println("Невалидна команда.");
            }
        }

        scanner.close();
    }
}
