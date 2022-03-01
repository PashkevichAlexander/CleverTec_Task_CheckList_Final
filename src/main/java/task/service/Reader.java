package task.service;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Reader {
    public int readInt() {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException exc) {
                System.out.println("try again enter correct value");
            }
        }
    }

    public boolean readBool() {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                boolean value = scanner.nextBoolean();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException exc) {
                System.out.println("try again enter correct value");
            }
        }
    }

}

