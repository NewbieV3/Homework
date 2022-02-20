package homework21;

import java.io.*;
import java.util.Scanner;

public class FileApp {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name of directory: ");

        File dir1 = new File(sc.next());
        if (!dir1.exists()) {
            dir1.mkdir();
            System.out.println("Directory has been created... " + dir1.getAbsolutePath() + '\n');
        } else {
            System.out.println("Directory is already exists. " + dir1.getAbsolutePath() + '\n');
        }

        System.out.println("Enter filename: ");

        File file1 = new File(dir1, sc.next());
        if (!file1.exists()) {
            file1.createNewFile();
            System.out.println("File has been created... " + file1.getAbsolutePath() + '\n');
        } else {
            System.out.println("File is already exists. " + file1.getAbsolutePath());
            System.out.println("Creating a new file overwrites it. " + '\n');
        }

        System.out.println("Do you want to write info or to read it? ");
        System.out.println("1. Write... ");
        System.out.println("2. Show me file info... ");


        int choice = sc.nextInt();
        if (choice == 1) {
            dataWriter(sc);
        } else if (choice == 2)
            System.out.println(dReader());
    }

    private static String FILE_NAME = "file/ex.txt";

    private static void dataWriter(Scanner sc) {

        try (FileWriter dw = new FileWriter(FILE_NAME, true)) {
            System.out.println("Fill the 'Product'-field: ");
            System.out.println("Fill 'Name' field: ");
            dw.write("Name: " + sc.next() + '\n');
            System.out.println("Fill 'Barcode' field: ");
            dw.write("Barcode: " + sc.nextInt() + '\n');
            System.out.println("Fill 'Price' field: ");
            dw.write("Price: " + sc.nextInt() + " rub./kg" + '\n' + '\r');

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Add item? ");
        System.out.println("1. Add... ");
        System.out.println("2. Finish. ");

        int choice2 = sc.nextInt();
        if (choice2 == 1) {
            dataWriter(sc);
        } else if (choice2 == 2) {

        }
    }

    public static String dReader() {
        var reader = new TXTParser("file/ex.txt");
        return reader.readTXTFile();
    }
}
