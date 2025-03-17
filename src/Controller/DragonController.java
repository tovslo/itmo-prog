package Controller;

import Model.DragonCollection;
import Model.FileManager;
import View.ConsoleView;

import java.util.Stack;

/**
 * Класс DragonController управляет взаимодействием между моделью и представлением.
 */
public class DragonController {
    private DragonCollection dragonCollection;
    private ConsoleView consoleView;
    private FileManager fileManager;
    private Stack<String> commandHistory;

    public DragonController(DragonCollection dragonCollection, ConsoleView consoleView, FileManager fileManager) {
        this.dragonCollection = dragonCollection;
        this.consoleView = consoleView;
        this.fileManager = fileManager;
        this.commandHistory = new Stack<>();
    }

    public void start() {
        String filename = System.getenv("DRAGON_FILE");
        dragonCollection = fileManager.loadFromFile(filename);

        while (true) {
            String command = consoleView.readCommand();
            commandHistory.push(command);

            switch (command) {
                case "add":
                    // Логика добавления дракона
                    break;
                case "remove":
                    // Логика удаления дракона
                    break;
                case "find":
                    // Логика поиска дракона
                    break;
                case "show":
                    consoleView.displayDragons(dragonCollection.getDragons());
                    break;
                case "save":
                    fileManager.saveToFile(filename, dragonCollection);
                    break;
                case "exit":
                    return;
                default:
                    consoleView.showMessage("Неизвестная команда");
            }
        }
    }
}