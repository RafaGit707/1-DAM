package Utiles;

import java.util.ArrayList;

public class Pokemon {

    //Atributos
    private int id;
    private int num;
    private String name;
    private String img;
    private ArrayList<String> type;
    private String height;
    private String weight;
    private String candy;
    private int candy_count;
    private String egg;
    private double spawn_chance;
    private double avg_spawns;
    private String spawn_time;
    private double[] multipliers;
    private ArrayList<String> weaknesses;
    private Prev_evolution[] prev_evolution;  
    private Next_evolution[] next_evolution;  

 
    //Constructor
    public Pokemon (){

    }


    //Métodos
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public int getNum() {
        return num;
    }


    public void setNum(int num) {
        this.num = num;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getImg() {
        return img;
    }


    public void setImg(String img) {
        this.img = img;
    }


    public ArrayList<String> getType() {
        return type;
    }


    public void setType(ArrayList<String> type) {
        this.type = type;
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


    public String getCandy() {
        return candy;
    }


    public void setCandy(String candy) {
        this.candy = candy;
    }


    public int getCandy_count() {
        return candy_count;
    }


    public void setCandy_count(int candy_count) {
        this.candy_count = candy_count;
    }


    public String getEgg() {
        return egg;
    }


    public void setEgg(String egg) {
        this.egg = egg;
    }


    public double getSpawn_chance() {
        return spawn_chance;
    }


    public void setSpawn_chance(double spawn_chance) {
        this.spawn_chance = spawn_chance;
    }


    public double getAvg_spawns() {
        return avg_spawns;
    }


    public void setAvg_spawns(double avg_spawns) {
        this.avg_spawns = avg_spawns;
    }


    public String getSpawn_time() {
        return spawn_time;
    }


    public void setSpawn_time(String spawn_time) {
        this.spawn_time = spawn_time;
    }


    public double[] getMultipliers() {
        return multipliers;
    }


    public void setMultipliers(double[] multipliers) {
        this.multipliers = multipliers;
    }


    public ArrayList<String> getWeaknesses() {
        return weaknesses;
    }


    public void setWeaknesses(ArrayList<String> weaknesses) {
        this.weaknesses = weaknesses;
    }


    public Prev_evolution[] getPrev_evolution() {
        return prev_evolution;
    }


    public void setPrev_evolutions(Prev_evolution[] prev_evolution) {
        this.prev_evolution = prev_evolution;
    }


    public Next_evolution[] getNext_evolution() {
        return next_evolution;
    }


    public void setNext_evolution(Next_evolution[] next_evolution) {
        this.next_evolution = next_evolution;
    }


    @Override
    public String toString() {
        return "(" + this.id + ") " + this.name + " " + this.type + " " + this.height + " " + this.weaknesses + "\n";
    }

}
