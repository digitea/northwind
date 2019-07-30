package se.digitea.adventure.engine.world;

import se.digitea.adventure.engine.core.Direction;
import se.digitea.adventure.engine.core.Nameable;
import se.digitea.adventure.engine.entities.Entity;

import java.util.List;
import java.util.Map;

public class Room implements Nameable {
    private final String name;
    private final String description;
    private final Map<Direction, Boolean> roomLinks;
    private final List<Entity> entities;


    public Room(String name, String description, Map<Direction, Boolean> roomLinks, List<Entity> entities) {
        this.name = name;
        this.description = description;
        this.roomLinks = roomLinks;
        this.entities = entities;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
