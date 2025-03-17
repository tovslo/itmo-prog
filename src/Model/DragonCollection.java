package Model;

import java.util.Vector;

/**
 * Класс DragonCollection управляет коллекцией объектов Dragon.
 */
public class DragonCollection {
    private Vector<Dragon> dragons;

    public DragonCollection() {
        dragons = new Vector<>();
    }

    public void addDragon(Dragon dragon) {
        dragons.add(dragon);
    }

    public void removeDragon(int id) {
//        dragons.removeIf(dragon -> dragon.getId() == id);
    }

    public Dragon findDragonById(int id) {
//        return dragons.stream().filter(dragon -> dragon.getId() == id).findFirst().orElse(null);
        return null;
    }

    public Vector<Dragon> getDragons() {
        return dragons;
    }

    // Другие методы для сортировки, фильтрации и т.д.
}
