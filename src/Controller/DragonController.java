package Controller;


import Model.Dragon;
import Model.DragonCollection;
import Model.FileManager;
import View.ConsoleView;

public class DragonController {
    private DragonCollection dragonCollection;
    private ConsoleView consoleView;
    private FileManager fileManager;

    public DragonController(DragonCollection dragonCollection, ConsoleView consoleView, FileManager fileManager) {
        this.dragonCollection = dragonCollection;
        this.consoleView = consoleView;
        this.fileManager = fileManager;
    }

    public void start() {
        String filename = System.getenv("DRAGON_FILE");
        dragonCollection = fileManager.loadFromFile(filename);

        while (true) {
            String command = consoleView.readCommand();
            String[] parts = command.split(" ", 2);

            switch (parts[0]) {
                case "help":
                    consoleView.help();
                    break;
                case "info":
                    consoleView.info("fuck!", "fuck!!", 7);
                    break;
                case "show":
                    consoleView.show(dragonCollection.getDragons());
                    break;
                case "add":
                    Dragon dragon = consoleView.readDragon();
                    dragonCollection.addDragon(dragon);
                    break;
//                case "update":
//                    long id = Long.parseLong(parts[1].split(" ")[0]);
//                    Dragon updatedDragon = consoleView.readDragon();
//                    dragonCollection.updateDragon(id, updatedDragon);
//                    break;
//                case "remove_by_id":
//                    long removeId = Long.parseLong(parts[1]);
//                    dragonCollection.removeDragonById(removeId);
//                    break;
//                case "clear":
//                    dragonCollection.clear();
//                    break;
//                case "save":
//                    fileManager.saveToFile(filename, dragonCollection);
//                    break;
//                case "execute_script":
//                    fileManager.executeScript(parts[1]);
//                    break;
                case "exit":
                    return;
//                case "add_if_max":
//                    Dragon maxDragon = consoleView.readDragon();
//                    dragonCollection.addIfMax(maxDragon);
//                    break;
//                case "remove_greater":
//                    Dragon greaterDragon = consoleView.readDragon();
//                    dragonCollection.removeGreater(greaterDragon);
//                    break;
//                case "history":
//                    consoleView.displayHistory();
//                    break;
//                case "group_counting_by_color":
//                    Map<Color, Long> groupedByColor = dragonCollection.groupCountingByColor();
//                    consoleView.displayGroupedByColor(groupedByColor);
//                    break;
//                case "count_greater_than_age":
//                    int age = Integer.parseInt(parts[1]);
//                    int count = dragonCollection.countGreaterThanAge(age);
//                    consoleView.displayCountGreaterThanAge(count);
//                    break;
//                case "filter_less_than_character":
//                    DragonCharacter character = DragonCharacter.valueOf(parts[1].toUpperCase());
//                    List<Dragon> filteredDragons = dragonCollection.filterLessThanCharacter(character);
//                    consoleView.displayFilteredByCharacter(filteredDragons);
//                    break;
                default:
//                    consoleView.showMessage("Неизвестная команда");
            }
        }
    }
}