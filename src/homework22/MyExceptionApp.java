package homework22;

import java.util.Scanner;

public class MyExceptionApp {
    public static void main(String[] args) throws InvalidValueException {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите значение, отличное от 0: ");

            int x = sc.nextInt();
            if (x == 0) {
                throw new InvalidValueException("Введено неверное значение. ");
            }

        } catch (InvalidValueException e) {
            e.printStackTrace();
        }

        System.out.println("Программа завершена.");
    }
}
