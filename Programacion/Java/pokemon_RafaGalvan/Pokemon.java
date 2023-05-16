package Java.pokemon_RafaGalvan;

import java.util.List;

public class Pokemon {
    
    private String name;
    private String id;
    private List<String> type;
    private List<String> weaknesses;
    private String height;
    private String weight;
    private List<String> evolutions;

    public Pokemon(String name,  String id, List<String> type, List<String> weaknesses, String height, String weight, List<String> evolutions) {
        this.name = name;
        this.type = type;
        this.weaknesses = weaknesses;
        this.height = height;
        this.weight = weight;
        this.evolutions = evolutions;
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

    public List<String> getEvolutions() {
        return evolutions;
    }

    public void setEvoluciones(List<String> evolutions) {
        this.evolutions = evolutions;
    }

}
