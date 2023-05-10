package Programacion.Java.pokemon_RafaGalvan;

import java.util.List;

public class Pokemon {
    
    private String name;
    private String id;
    private String height;
    private String weight;
    private List<String> type;
    private List<String> weaknesses;
    private String prev_evolution;
    private String next_evolution;
    
    // Constructor
    public Pokemon(String name, String id, String height, String weight, List<String> type, List<String> weaknesses, String prev_evolution, String next_evolution) {
        this.name = name;
        this.id = id;
        this.height = height;
        this.weight = weight;
        this.type = type;
        this.weaknesses = weaknesses;
        this.prev_evolution = prev_evolution;
        this.next_evolution = next_evolution;
    }
    
    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public List<String> getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(List<String> weaknesses) {
        this.weaknesses = weaknesses;
    }

    public String getPrev_evolution() {
        return prev_evolution;
    }

    public void setPrev_evolution(String prev_evolution) {
        this.prev_evolution = prev_evolution;
    }

    public String getNext_evolution() {
        return next_evolution;
    }

    public void setNext_evolution(String next_evolution) {
        this.next_evolution = next_evolution;
    }
}
