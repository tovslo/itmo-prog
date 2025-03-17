package View;

import Model.Dragon;

import java.util.Scanner;
import java.util.Vector;

/**
 * Класс ConsoleView отвечает за взаимодействие с пользователем через консоль.
 */
public class ConsoleView {
    private Scanner scanner;

    public ConsoleView() {
        scanner = new Scanner(System.in);
    }

    public String readCommand() {
        System.out.print("Введите команду: ");
        return scanner.nextLine();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void displayDragons(Vector<Dragon> dragons) {
        for (Dragon dragon : dragons) {
            System.out.println(dragon);
        }
    }
}