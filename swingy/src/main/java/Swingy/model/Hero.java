package model;

public class Hero {
    private String[] HeroType = { "MAGE", "WARRIOR", "ORC", "HUMAN" };
    protected String Type;
    protected String Name;

    public Hero CreateHero(int HeroChoice, String HeroName) {
        this.Type = HeroType[HeroChoice- 1];
        this.Name = HeroName;
        return(this);
    }

}