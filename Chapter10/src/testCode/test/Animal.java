package testCode.test;

public class Animal {
    public String name;
    public String kind;
    public int legCount;
    public int iq;
    public boolean hasWing ;
    public void move(){
        System.out.println("move() - Parent");
    }
    public void eatFood(){
        System.out.println("eatFood() - Parent");
    }
}
