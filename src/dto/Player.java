package dto;

public class Player {
    int id;
    String name;
    char c ;
    public Player(){}
    public Player(int id, String name, char c)
    {
        this.id = id;
        this.name = name;
        this.c = c;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getC() {
        return c;
    }
}
