package Utiles;

public class Next_evolution {

    //Atributos
    int num;
    String name;


    //Constructor
    public Next_evolution() {

    }


    //Métodos
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

    @Override
    public String toString() {
        return this.num + " " + this.name;
    }
    
}
